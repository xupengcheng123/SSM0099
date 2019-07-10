package cn.smbms.controller;

import cn.smbms.pojo.Address;
import cn.smbms.service.address.AddressService;
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
@RequestMapping("/address")
public class AddressController {
	private Logger logger = Logger.getLogger(AddressController.class);
	@Resource
	AddressService addressService;

	@RequestMapping(value="list.html",method=RequestMethod.GET)
	public String main(Model model){
		List<Address> addressList = new ArrayList<Address>();
		addressList =addressService.getAddressList();
		model.addAttribute("addressList",addressList);
		return "address/list";
	}
	@RequestMapping(value="/del.html")
	public String del(@RequestParam int id){
		boolean flag =addressService.delAddress(id);
		return "redirect:list.html";
	}
	@RequestMapping(value="/add.html")
	public String add(){
		return "address/edit";
	}
	@RequestMapping(value="/save.html")
	public String save(Address address){
		if(null!=address&&null!=address.getId()&&!"".equals(address.getId())){
			boolean flag =addressService.updateAddress(address);
		}
		else{
			boolean flag =addressService.insertAddress(address);
		}

		return "redirect:list.html";
	}
	@RequestMapping(value="update.html")
	public String update(@RequestParam int id,Model model){
		Address address =addressService.getAddressById(id);
		model.addAttribute("address", address);
		return "address/edit";
	}
	@RequestMapping(value="view.html")
	public String view(@RequestParam int id,Model model){
		Address address =addressService.getAddressById(id);
		model.addAttribute("address", address);
		return "address/view";
	}
}
