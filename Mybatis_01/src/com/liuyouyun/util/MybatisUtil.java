package com.liuyouyun.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	public static SqlSessionFactory factory;
	public static SqlSessionFactory getFactory(){
		try {
			if(factory==null){
				//Resources :访问资源文件工具类
				InputStream is  = Resources.getResourceAsStream("config.xml");
				factory =new SqlSessionFactoryBuilder().build(is);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}
	//
	public static SqlSession getSession(boolean isAutoCommit) {
		return getFactory().openSession(isAutoCommit);
	}
	public static SqlSession getSession( ) {
		return getFactory().openSession();
	}
}
