package com.emr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageHandOut {
	/********************** 首页展示 *********************/
	@RequestMapping(value = "/")
	public String index() {
		return "font/index";
	}

	@RequestMapping(value = "/login-page")
	public String loginPage() {
		return "font/login-page";
	}

	@RequestMapping(value = "/record")
	public String recordPage() {
		return "font/record";
	}

	/*************************************************/

	/********************** 后台页面转发 ******************/

	// 后台页面
	@RequestMapping(value = "/back-layui")
	public String back_layui() {
		return "back/back-layui";
	}

	// 新建电子病历
	@RequestMapping(value = "/new_medical_history")
	public String new_medical_history() {
		return "back/new_medical_history";
	}

	// 删除电子病历
	@RequestMapping(value = "/del_medical_history")
	public String del_medical_history() {
		return "back/del_medical_history";
	}

	// 修改电子病历
	@RequestMapping(value = "/alter_medical_history")
	public String alter_medical_history() {
		return "back/alter_medical_history";
	}

	// 查询电子病历
	@RequestMapping(value = "/show_medical_history")
	public String show_medical_history() {
		return "back/show_medical_history";
	}

	// 修改密码
	@RequestMapping(value = "/alter_password")
	public String alter_password() {
		return "back/alter_password";
	}

	// 药品查询
	@RequestMapping(value = "/show_drug")
	public String show_drug() {
		return "back/show_drug";
	}
	/***********************************************/
}
