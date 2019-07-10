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
@RequestMapping("/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);
	@Resource
	UserService userService;

	@RequestMapping(value="list.html",method=RequestMethod.GET)
	public String main(Model model){
		List<User> userList = new ArrayList<User>();
		userList =userService.getUserList();
		model.addAttribute("userList",userList);
		return "user/list";
	}
	@RequestMapping(value="/del.html")
	public String del(@RequestParam int id){
		boolean flag =userService.delUser(id);
		return "redirect:list.html";
	}
	@RequestMapping(value="/add.html")
	public String add(){
		return "user/edit";
	}
	@RequestMapping(value="/save.html")
	public String save(User user){
		if(null!=user&&null!=user.getId()&&!"".equals(user.getId())){
			boolean flag =userService.updateUser(user);
		}
		else{
			boolean flag =userService.insertUser(user);
		}

		return "redirect:list.html";
	}
	@RequestMapping(value="update.html")
	public String update(@RequestParam int id,Model model){
		User user =userService.getUserById(id);
		model.addAttribute("user", user);
		return "user/edit";
	}
	@RequestMapping(value="view.html")
	public String view(@RequestParam int id,Model model){
		User user =userService.getUserById(id);
		model.addAttribute("user", user);
		return "user/view";
	}
}
