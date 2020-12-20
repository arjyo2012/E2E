package com.apex.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.apex.user.bo.UserBO;
import com.apex.user.vo.User;

@Controller
public class UserController {
	@Autowired
	UserBO userBO;
	@RequestMapping("/entryAddUser.do")
	public String entryAddUser(@ModelAttribute("userabc") User userper) {
	System.out.println(userper.getFirstName());
	System.out.println("UserController :entryAddUser ");
		return "person";
		
	}
	@RequestMapping("/processAddUser.do")
	public String processAddUser(@ModelAttribute("userab") User userres) {
		System.out.println("AddUserController logic -  strating");
		
		System.out.println(userres.getFirstName());
		
		//step2
		//call the business object
		userBO.addUser(userres);
		
	//	ModelAndView mv = new ModelAndView("success", "usr", userres);
		System.out.println("AddUserController logic -  end");
		//step3
		//return mv;
		//System.out.println(userres.getFirstName());
		
		return "success";
		
	}
}
