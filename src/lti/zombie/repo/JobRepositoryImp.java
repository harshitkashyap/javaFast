package lti.zombie.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lti.zombie.bean.JobBean;
import lti.zombie.bean.LoginBean;
import lti.zombie.bean.ProfileBean;
import lti.zombie.bean.UserBean;
import lti.zombie.bean.RequirementBean;

@Repository
public class JobRepositoryImp implements JobRepository {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public String Validate(LoginBean login) {
		
		Session session=factory.getCurrentSession();
		
		UserBean user=(UserBean)session.get(UserBean.class,login.getEmail());
		
		
		if(user!=null)
			return user.getEmail();
		else
			return null;
		
		
	}

	@Override
	public boolean save(UserBean user) {
		Session session=factory.getCurrentSession();
		try {
			session.save(user);
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
		
		Session session=factory.getCurrentSession();
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
		
		Session session=factory.getCurrentSession();
		
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
