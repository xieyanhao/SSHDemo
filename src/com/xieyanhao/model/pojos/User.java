package com.xieyanhao.model.pojos;

/**
 * @ClassName: User.java
 * @Description: TODO(用户实体)
 * 
 * @author xieyanhao
 * @Date 2014年12月22日 下午3:19:21
 */
public class User {

	private Integer id;

	private String username;

	private String password;

	private String email;

	private String headIco;

	private Integer eId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadIco() {
		return headIco;
	}

	public void setHeadIco(String headIco) {
		this.headIco = headIco;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

}
