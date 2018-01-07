package com.learn.chapter8.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.RowBounds;
import com.learn.chapter8.pojo.UserBean;

@Repository
public interface UserDao {
	public UserBean getUser(Integer id);
	
	public int insertUser(UserBean user);
	
	public int deleteUser(Integer id);
	
	public int updateUser(UserBean user);
	
	public List<UserBean> findUsers(String userName, RowBounds rowBounds);
}
