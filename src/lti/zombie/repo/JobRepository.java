package lti.zombie.repo;

import java.util.List;

import lti.zombie.bean.JobBean;
import lti.zombie.bean.LoginBean;
import lti.zombie.bean.ProfileBean;
import lti.zombie.bean.UserBean;
import lti.zombie.bean.RequirementBean;



public interface JobRepository {
	
String Validate(LoginBean login);
	
	boolean save(UserBean user);
	
	List<RequirementBean> getRecommendations(String email);
	
	List<RequirementBean> searchJob(String skill);

	boolean jobStatus(JobBean job);

	boolean saveJob(UserBean user, JobBean job);

}
