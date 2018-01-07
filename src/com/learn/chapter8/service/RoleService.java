package com.learn.chapter8.service;

import java.util.List;
import com.learn.chapter8.pojo.RoleBean;

public interface RoleService {
	public int insertRole(RoleBean role);

	public int updateRole(RoleBean role);

	public int deleteRole(Integer id);
	
	public RoleBean getRole(Integer id);
	
	public List<RoleBean> findRoles(String roleName, int start, int limit);
}
