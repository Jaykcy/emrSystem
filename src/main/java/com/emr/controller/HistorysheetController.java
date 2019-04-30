package com.emr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emr.pojo.Historysheet;
import com.emr.service.HistorysheetService;
import com.emr.utils.Msg;

@Controller
@RequestMapping(value="/todo")
public class HistorysheetController {
	
	@Autowired
	private HistorysheetService historysheetService;
	//病例的保存
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveHistorysheet(@RequestBody Historysheet h){
		System.out.println(h.toString());
		//historysheetService.insert(h);
		return Msg.success();
	}
	
}
