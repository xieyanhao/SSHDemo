package com.xieyanhao.server.impl;

import java.util.List;

import com.xieyanhao.dao.UserDao;
import com.xieyanhao.model.pojos.User;
import com.xieyanhao.server.UserService;

/**
 * @ClassName: UserService.java
 * @Description: TODO(用一句话描述该文件做什么)
 * 
 * @author xieyanhao
 * @Date 2014年12月22日 下午4:34:05
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUser(User user) {

		User result = userDao.getUser(user);
		System.out.println(result.getEmail());
		return result;
	}

	@Override
	public List<User> listUser() {
		List<User> users = userDao.listUser();
		return users;
	}

	@Override
	public User getUser1(Integer id) {
		User result = userDao.getUser1(id);
		return result;
	}

	@Override
	public void update1(User user) {
		
		userDao.update1(user);
	}

}
