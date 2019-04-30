package com.emr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.dao.RoleMapper;
import com.emr.pojo.Role;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	@Override
	public List<Role> selectAllRole() {
		return roleMapper.selectAllRole();
	}

}
