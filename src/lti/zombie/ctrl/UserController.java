package lti.zombie.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lti.zombie.bean.UserBean;
import lti.zombie.service.JobService;

public class UserController {
	
	@Autowired
	private JobService service;
	
	@RequestMapping(value="user.job",method=RequestMethod.POST)
	public String register(UserBean user) {
		if(service.persist(user))
			return "Home";
			else
			return "register";
		
	}

}
