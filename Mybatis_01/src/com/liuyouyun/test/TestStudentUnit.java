package com.liuyouyun.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.liuyouyun.dto.Student;
import com.liuyouyun.util.MybatisUtil;

public class TestStudentUnit {

	SqlSessionFactory factory =null;
	@Before
	public void testBefore(){
		factory=MybatisUtil.getFactory();
	}
	
	@Test
	public void testSelectAll() {
		 SqlSession session =  factory.openSession();
		List<Student> list =  session.selectList("com.liuyouyun.dto.Student.listAll");
		for(Student s : list){
			System.out.println(s);
		}
		//关闭session
		session.close();
	}
	
	@Test
	public void testUpdate() {
		// 默认 手动提交false，  
		// true ： 自动提交，  false:手动提交 
		SqlSession session =  factory.openSession();
		  
		Student stu =  session.selectOne("com.j1811.dto.Student.selectById", 2);
		 // 修改
		stu.setAge(26);
		//修改
		int count = session.update("com.j1811.dto.Student.update",stu);
		 if(count>0){
			 System.out.println("修改成功");
		 }
		 session.commit();
		//关闭session
		session.close();
	}
	@Test
	public void testAdd() {
		SqlSession session =  factory.openSession();
		session.insert("com.j1811.dto.Student");
	}

}
