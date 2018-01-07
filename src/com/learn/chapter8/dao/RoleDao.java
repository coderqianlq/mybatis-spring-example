package com.learn.chapter8.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import com.learn.chapter8.pojo.RoleBean;

@Repository
public interface RoleDao {
	public int insertRole(RoleBean role);
	
	public int updateRole(RoleBean role);
	
	public int deleteRole(Integer id);
	
	public RoleBean getRole(Integer id);
	
	public List<RoleBean> findRoles(String roleName, RowBounds rowBounds);
}
