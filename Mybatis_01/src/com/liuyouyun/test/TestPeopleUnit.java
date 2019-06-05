package com.liuyouyun.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.liuyouyun.dao.annotation.PeopleDao;
import com.liuyouyun.entity.People;
import com.liuyouyun.util.MybatisUtil;
// 测试pull操作
public class TestPeopleUnit {

	@Test
	public void add() {
		  SqlSessionFactory factory = MybatisUtil.getFactory();
		  SqlSession session = factory.openSession();
		  
		  //生成实现类
		 PeopleDao dao =  session.getMapper(PeopleDao.class);
		 
		 People people = new People();
		 people.setPname("张呵呵");
		 people.setSex("男");
		 people.setPassword("999");
		 people.setBirthday(new Date());
	  	 int count = dao.add(people);
	  	 System.out.println(count);
	  	 //提交事务
	  	 session.commit();
	  	 session.close();
		 
	}

	@Test
	public void  delete(){
		
		
	}

	@Test
	public void update(){
		
		
	}

	@Test
	public void findById(){
		
	}

	@Test
	public void listAll(){
	}

}
