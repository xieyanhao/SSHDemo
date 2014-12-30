package com.xieyanhao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xieyanhao.dao.UserDao;
import com.xieyanhao.model.pojos.User;

/**
 * @ClassName: UserDaoImpl.java
 * @Description: TODO(用一句话描述该文件做什么)
 * 
 * @author xieyanhao
 * @Date 2014年12月22日 下午4:35:06
 */
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 查询方法1 此方法不安全，会产生SQL Injection安全漏洞
	 */
	@SuppressWarnings("unchecked")
	@Override
	public User getUser(User user) {
		String hql = "from User where username ='" + user.getUsername() + "' and password = '" + user.getPassword() + "'";
		// 查询出User实体对象所对应的所有数据，而且将数据封装成User实体对象，并且放入List中返回
		List<User> list = getSession().createQuery(hql).list();
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 查询方法2
	 */
	@Override
	public User getUser1(Integer id) {
		String hql = "from User u where u.id = :id";
		// 查询出User实体对象所对应的所有数据，而且将数据封装成User实体对象，并且放入List中返回
		Query query = getSession().createQuery(hql);
		query.setInteger("id", id);
		// query.setParameter("name", user.getUsername());
		// query.setParameter("psw", user.getPassword());
		query.setMaxResults(1);// 必须在查询之前指定，使其返回单个对象
		User user = (User) query.uniqueResult();
		System.out.println(user.getEmail());
		return user;
	}

	/**
	 * 查询方法3
	 */
	@SuppressWarnings("unchecked")
	public User getUser2(User user) {
		String hql = "from User u where u.username = ? and u.password = ?";
		// 查询出User实体对象所对应的所有数据，而且将数据封装成User实体对象，并且放入List中返回
		Query query = getSession().createQuery(hql);
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		List<User> list = query.list();
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 查询方法4
	 * setProperties()方法会自动将user对象实例的属性值匹配到命名参数上，但是要求命名参数名称必须要与实体对象相应的属性同名。
	 */
	@SuppressWarnings("unchecked")
	public User getUser3(User user) {
		String hql = "from User u where u.username = :username and u.password = :password";
		// 查询出User实体对象所对应的所有数据，而且将数据封装成User实体对象，并且放入List中返回
		Query query = getSession().createQuery(hql);
		query.setProperties(user);
		List<User> list = query.list();
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 查询方法5 列表查询
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {
		String hql = "from User";
		Query query = getSession().createQuery(hql);
		List<User> objs = query.list();
		return objs;
	}

	/**
	 * update 更新 1
	 */
	public void update1(User user) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ user.getUsername());
		getSession().update(user);
	}

	/**
	 * update 更新 2
	 */
	public void update2(Integer id) {
		String hql = "update User as u set u.email = 'xieyanhao@222.com' where u.id = :id";
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		int num = query.executeUpdate();
		System.out.println(num);
	}

	/**
	 * 增加
	 * @param user
	 */
	public void AddUser(User user) {
		getSession().save(user);
	}

	/**
	 * delete删除 1
	 */
	public void delete1(Integer id) {
		String hql = "delete from  User as u where u.id = :id";
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		int num = query.executeUpdate();
		System.out.println(num);
	}

	/**
	 * delete删除 2
	 */
	public void delete2(User user) {
		getSession().delete(user);
	}
}
