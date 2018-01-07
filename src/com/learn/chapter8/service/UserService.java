package com.learn.chapter8.service;

import java.util.List;
import com.learn.chapter8.pojo.UserBean;

public interface UserService {
	public UserBean getUser(Integer id);
	
	public int insertUser(UserBean user);
	
	public int deleteUser(Integer id);
	
	public int updateUser(UserBean user);
	
	public List<UserBean> findUsers(String userName, int start, int limit);
}
