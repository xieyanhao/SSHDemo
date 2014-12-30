package com.xieyanhao.server;

import java.util.List;

import com.xieyanhao.model.pojos.User;

/**
 * @ClassName:     UserService.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * 
 * @author         xieyanhao
 * @Date           2014年12月22日 下午4:33:51 
 */
public interface UserService {
	
	public User getUser(User user); 
	public User getUser1(Integer id);
	public List<User> listUser();  
	public void update1(User user);
}
