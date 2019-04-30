package com.emr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emr.pojo.Role;
import com.emr.service.RoleService;
import com.emr.utils.Msg;

@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;
	@ResponseBody
	@RequestMapping(value = "/getAllRole")
	public Msg getAllRole() {
		List<Role> allRole = roleService.selectAllRole();
		return Msg.success().add("allRole", allRole);
	}
}
