package lti.zombie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lti.zombie.bean.JobBean;
import lti.zombie.bean.LoginBean;
import lti.zombie.bean.ProfileBean;
import lti.zombie.bean.RequirementBean;
import lti.zombie.bean.UserBean;
import lti.zombie.repo.JobRepository;
import lti.zombie.repo.JobRepositoryImp;

@Service
public class JobServiceImp implements JobService {
	
	@Autowired
	private JobRepositoryImp repo;

	@Override
	public String authenticate(LoginBean login) {

		String name=repo.Validate(login);
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean persist(UserBean user) {
		
		boolean save=repo.save(user);
		return save;
	}

	@Override
	public ProfileBean getProfile(String email) {
		return null;
	}

	@Override
	public List<RequirementBean> getRecommendations(String email) {
		return repo.getRecommendations(email);
	}

	@Override
	public List<RequirementBean> searchJob(String skill) {
		// TODO Auto-generated method stub
		return repo.searchJob(skill);
	}

	@Override
	public boolean applyJob(JobBean job) {
		
		return false;
		
	}

}
