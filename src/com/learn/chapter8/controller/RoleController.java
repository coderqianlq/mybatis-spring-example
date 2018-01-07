package com.learn.chapter8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.chapter8.pojo.RoleBean;
import com.learn.chapter8.service.RoleService;

@Controller
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@ResponseBody
	@RequestMapping("/role/getRole")
	public RoleBean getRole(@RequestParam("id") int id){
		long start = System.currentTimeMillis();
		RoleBean role = roleService.getRole(id);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		return role;
	}
}
