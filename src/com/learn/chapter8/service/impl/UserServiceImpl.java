package com.learn.chapter8.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.learn.chapter8.dao.UserDao;
import com.learn.chapter8.pojo.UserBean;
import com.learn.chapter8.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public UserBean getUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int insertUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public int updateUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public List<UserBean> findUsers(String userName, int start, int limit) {
		// TODO Auto-generated method stub
		return userDao.findUsers(userName, new RowBounds(start, limit));
	}

}
