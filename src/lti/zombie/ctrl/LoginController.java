package lti.zombie.ctrl;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import lti.zombie.bean.LoginBean;
import lti.zombie.bean.UserBean;
import lti.zombie.service.JobService;

@Controller
/*@SessionAttributes({"User"})*/
public class LoginController {
	
	@Autowired
	private JobService service;

	@RequestMapping(value="signin.job", method=RequestMethod.POST)
	public String signin(LoginBean login,ModelMap map) {
		 UserBean user=service.authenticate(login);
		 if(user!=null) {
			 
			 System.out.println(user.getEmail());
		 	map.addAttribute("User",user);
			 return "profile";
		 }else
			return "Home";
	}
}
