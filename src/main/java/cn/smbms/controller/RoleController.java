package cn.smbms.controller;

import cn.smbms.pojo.Role;
import cn.smbms.service.role.RoleService;
import cn.smbms.service.role.RoleService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
	private Logger logger = Logger.getLogger(RoleController.class);
	@Resource
	RoleService roleService;

	@RequestMapping(value="list.html",method=RequestMethod.GET)
	public String main(Model model){
		List<Role> roleList = new ArrayList<Role>();
		roleList =roleService.getRoleList();
		model.addAttribute("roleList",roleList);
		return "role/list";
	}
	@RequestMapping(value="/del.html")
	public String del(@RequestParam int id){
		boolean flag =roleService.delRole(id);
		return "redirect:list.html";
	}
	@RequestMapping(value="/add.html")
	public String add(){
		return "role/edit";
	}
	@RequestMapping(value="/save.html")
	public String save(Role role){
		if(null!=role&&null!=role.getId()&&!"".equals(role.getId())){
			boolean flag =roleService.updateRole(role);
		}
		else{
			boolean flag =roleService.insertRole(role);
		}

		return "redirect:list.html";
	}
	@RequestMapping(value="update.html")
	public String update(@RequestParam int id,Model model){
		Role role =roleService.getRoleById(id);
		model.addAttribute("role", role);
		return "role/edit";
	}
	@RequestMapping(value="view.html")
	public String view(@RequestParam int id,Model model){
		Role role =roleService.getRoleById(id);
		model.addAttribute("role", role);
		return "role/view";
	}
}
