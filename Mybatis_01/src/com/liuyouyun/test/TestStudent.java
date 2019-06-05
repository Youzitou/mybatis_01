package com.liuyouyun.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.liuyouyun.dto.Student;

public class TestStudent {

	public static void main(String[] args) throws IOException {
		  // Mybatis的几个核心组件（核心类）
		// 1、SqlSessionFactory  ： 用于获取数据库连接的工厂类  
		// 2、 SqlSession  ：用户获取数据库连接对象  
		
		
		
		// 1 创建sqlsessionFactory对象
		InputStream is = Resources.getResourceAsStream("config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
	
		// 2、创建sqlsession对象，用于执行sql映射xml
		 SqlSession sqlSession  = factory.openSession();
				 
		// 3 执行查询语句
	/*	String statement = "com.j1811.dto.Student.selectById"; // namespace+id
		 // 查询一行记录  selectOne
		Student stu =(Student) sqlSession.selectOne(statement, 1);
		 
		System.out.println(stu);*/
		 // 查询所有 selectList
		
		// 添加学生
		 Student stu= new Student();
		 stu.setStuname("张三");
		 stu.setAge(22);
		 stu.setSex("男");
		 stu.setBirthday(new Date());
		int count =  sqlSession.insert("com.liuyouyun.dto.Student.add", stu);
		if(count>0){
			System.out.println("添加成功");
		} else{
			System.out.println("添加失败");
		}
		// 自动提交事务 
		
		sqlSession.commit();
		
	}
}
