package com.emr.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emr.pojo.Drug;
import com.emr.service.DrugService;
import com.github.pagehelper.PageHelper;

@RestController
public class DrugController {
	@Autowired
	private DrugService drugService;
	
	//药品全部查询加模糊查询
	@RequestMapping(value = "/selectAllDrug",method = RequestMethod.POST)
	public Map<String, Object> selectAllDrug(@RequestParam(value = "name", defaultValue = "") String name,@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "10") int limit) throws UnsupportedEncodingException {
		PageHelper.startPage(page, limit);
		List<Drug> docs = null;
		int count=0;
		if(name.equals("")){
			docs=drugService.selectAllDrug();
			count=drugService.selectCountDrug();
		}else{
			docs=drugService.selectAllDrugLike(name);
			count=drugService.selectCountDrugLike(name);
		}
		Map<String, Object> map = new HashMap<>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", count);
		map.put("data", docs);
		return map;
	}
	
}
