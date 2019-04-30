package com.emr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.dao.DrugMapper;
import com.emr.pojo.Drug;
import com.emr.pojo.DrugExample;
import com.emr.pojo.DrugExample.Criteria;

@Service
public class DrugServiceImpl implements DrugService {

	@Autowired
	private DrugMapper drugMapper;

	@Override
	public int selectCountDrug() {
		return (int) drugMapper.countByExample(null);
	}
	
	@Override
	public int selectCountDrugLike(String name) {
		return (int) drugMapper.countByLike(name);
	}

	@Override
	public List<Drug> selectAllDrug() {
		return drugMapper.selectByExample(null);
	}

	@Override
	public List<Drug> selectAllDrugLike(String name) {
		DrugExample example = new DrugExample();
		Criteria drugCriteria = example.createCriteria();
		drugCriteria.andDrNameLike("%"+name+"%");
		return drugMapper.selectByExample(example);
	}

}
