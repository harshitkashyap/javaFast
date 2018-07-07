package lti.zombie.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lti.zombie.bean.JobBean;
import lti.zombie.bean.LoginBean;
import lti.zombie.bean.ProfileBean;
import lti.zombie.bean.UserBean;
import lti.zombie.bean.RequirementBean;

@Repository
@Transactional
public class JobRepositoryImp implements JobRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
//	@Transactional
	public UserBean Validate(LoginBean login) {
		
		Session session=sessionFactory.getCurrentSession();
		//Transaction txn=session.beginTransaction();
		UserBean user=(UserBean)session.get(UserBean.class,login.getEmail());
		//txn.commit();
		
		if(user!=null)
			return user;
		else
			return null;
		
		
	}

	@Override
	public boolean save(UserBean user) {
		Session session=sessionFactory.getCurrentSession();
		
		try {
			if(session!=null)
			System.out.println("session not null");
			
			//Transaction txn=session.beginTransaction();
			session.save(user);
			//txn.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}



	@Override
	public List<RequirementBean> getRecommendations(String email) {
		
		String hql="from RequirementBean where skill=? and type=? and location=? and salary=?";
		
		Session session=sessionFactory.getCurrentSession();
		UserBean userBean=(UserBean)session.get(UserBean.class,email);
		
		Query query=session.createQuery(hql);
		query.setParameter(1,userBean.getSkill());
		query.setParameter(2,userBean.getType());
		query.setParameter(3,userBean.getLocation());
		query.setParameter(4, userBean.getExpSal());
		
		
		return query.list();
	}

	@Override
	public List<RequirementBean> searchJob(String skill) {
		
		String hql="from RequirementBean where skill=:skl";
		
		Session session=sessionFactory.getCurrentSession();
		
		Query query=session.createQuery(hql);
		query.setParameter("skl", skill);
		return query.list();
		
	}

	@Override
	public boolean jobStatus(JobBean job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveJob(UserBean user, JobBean job) {
		
		return false;
	}
	

}
