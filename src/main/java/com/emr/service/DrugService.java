package com.emr.service;

import java.util.List;

import com.emr.pojo.Drug;

public interface DrugService {
	public List<Drug> selectAllDrug();
	public List<Drug> selectAllDrugLike(String name);
	public int selectCountDrug();
	public int selectCountDrugLike(String name);
}
