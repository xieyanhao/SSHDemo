package com.xieyanhao.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.xieyanhao.model.pojos.User;
import com.xieyanhao.server.UserService;

/**
 * @ClassName: LoginAction.java
 * @Description: TODO(用一句话描述该文件做什么)
 * 
 * @author xieyanhao
 * @Date 2014年12月22日 下午1:51:52
 */
public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1382463806235589294L;

	private UserService userService;
	private User user;
	List<User> list;
	HttpServletRequest request=ServletActionContext.getRequest();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getList() {
		return list;
	}

	public String login() {

		return "login";
	}

	public String getLogin() throws IOException {

		User result = userService.getUser(user);
		if (result == null) {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print("<script>alert('用户不存在！');history.go(-1);</script>");
			return null;
		} else {
			list = userService.listUser();
			return "listUser";
		}
	}
	
	public String edit(){
		String id = request.getParameter("id");
		user = userService.getUser1(Integer.parseInt(id));
		return "edit";
	}
	
	public String update(){
		userService.update1(user);
		list = userService.listUser();
		return "listUser";
	}
}
























