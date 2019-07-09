package cn.smbms.controller;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
	public String main(Model model){
		List<User> userList = new ArrayList<User>();
		userList =userService.getUserList();
		model.addAttribute("userList",userList);
		return "main";
	}
	@RequestMapping(value="/del.html")
	public String del(@RequestParam int id){
		if(userService.delUser(id)){
			return "redirect:sys/main.html";
		}
		return "redirect:sys/main.html";
	}
	@RequestMapping(value="/add.html")
	public String add(){
		return "edit";
	}
	@RequestMapping(value="/save.html")
	public String save(User user){
		if(null!=user&&null!=user.getId()&&!"".equals(user.getId())){
			boolean flag =userService.updateUser(user);
		}
		else{
			boolean flag =userService.insertUser(user);
		}

		return "redirect:sys/main.html";
	}
	@RequestMapping(value="update.html")
	public String update(@RequestParam int id,Model model){
		User user =userService.getUserById(id);
		model.addAttribute("user", user);
		return "edit";
	}
	@RequestMapping(value="view.html")
	public String view(@RequestParam int id,Model model){
		User user =userService.getUserById(id);
		model.addAttribute("user", user);
		return "view";
	}
}
