package com.emr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.dao.HistorysheetMapper;
import com.emr.pojo.Historysheet;

@Service
public class HistorysheetServiceImpl implements HistorysheetService {
	
	@Autowired
	private HistorysheetMapper historysheetMapper;
	@Override
	public void insert(Historysheet h) {
		historysheetMapper.insert(h);
	}

}
