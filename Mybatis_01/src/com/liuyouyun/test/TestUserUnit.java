package com.liuyouyun.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.liuyouyun.dao.UserDao;
import com.liuyouyun.entity.User;
import com.liuyouyun.util.MybatisUtil;

public class TestUserUnit {

	@Test
	public void add() {
		 SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session =  factory.openSession();
		//session.getMapper(arg0)
		// 以前有实现类时：  接口   对象=  new 接口的实现类 ，
		//  现在：  session.getMapper生成对个 动态实现类 
		UserDao dao = session.getMapper(UserDao.class);
		
		User user = new User();
		user.setName("张哈哈");
		user.setAge(19);
		user.setBirthday(new Date());
		user.setPassword("88888");
		int count = dao.add(user);
		System.out.println(count);
		
		session.commit();
				
	}
	
	@Test
	public void delete() {
		 
	}
	
	@Test
	public void update() {
		 
	}
	
	@Test
	public void findById() {
		 SqlSessionFactory factory = MybatisUtil.getFactory();
			SqlSession session =  factory.openSession();
			
			UserDao dao = session.getMapper(UserDao.class);
			User user = dao.findById(1);
			System.out.println(user);
		
	}
	
	@Test
	public void listAll() {
		 
	}
	
	

}
