package cn.smbms.controller;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);
	@Resource
	UserService userService;
	@RequestMapping(value="/login.html",method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	@RequestMapping(value="/dologin.html",method=RequestMethod.POST)
	public String dologin(@RequestParam String userCode,@RequestParam String userPassword,HttpServletRequest request,HttpSession session)throws Exception{
		User user=userService.login(userCode, userPassword);
		if(null!=user){
			session.setAttribute("userLogin", user);
			return "redirect:sys/main.html";
		}
		else{
			request.setAttribute("error", "用戶名或密碼不正確");
			return "login";
		}
	}
	@RequestMapping(value="/sys/main.html",method=RequestMethod.GET)
	public String main(){
		return "main";
	}
}
