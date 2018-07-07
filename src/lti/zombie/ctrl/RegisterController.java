package lti.zombie.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import lti.zombie.bean.UserBean;
import lti.zombie.service.JobServiceImp;

@Controller
@SessionAttributes("userDetails")
public class RegisterController {
	
	
	@Autowired
	private JobServiceImp service;
	
	@RequestMapping(value="/register.job", method=RequestMethod.POST)
	public String registerUser(UserBean user,Model map) {
		
		System.out.println(user.getEmail());
		if(user!=null) {
			
			map.addAttribute("userDetails", user);
			return "resume";
			
		}else
			return "register";
		
	}
	
	@RequestMapping(value="/resume.job", method=RequestMethod.POST)
	public String registerUserResume(@ModelAttribute("userDetails") UserBean userDetails,UserBean resumeDetails) {
		
		
		System.out.println(userDetails.getEmail());
		if(userDetails!=null) {
			userDetails.setType(resumeDetails.getType());
			userDetails.setLocation(resumeDetails.getLocation());
			userDetails.setSkill(resumeDetails.getSkill());
			
			service.persist(userDetails);
			
			return "Home";		
		}
		else
			return "resume";
		
	}
	
	

}
