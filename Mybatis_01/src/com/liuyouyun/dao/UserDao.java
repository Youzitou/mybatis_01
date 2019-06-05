package com.liuyouyun.dao;

import java.util.List;

import com.liuyouyun.entity.User;

public interface UserDao {

	public int  add(User user);
	
	public int delete(int id);
	
	public int update(User user);
	
	public User  findById(int id);
	
	public List<User> listAll();
}
