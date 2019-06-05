package com.liuyouyun.dao.annotation;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.liuyouyun.entity.People;
/**
 * 通过注解方式 给没有方法设置 sql
 */
public interface PeopleDao {
   // value中写sql语句   自动获取形参的属性（pname ，password等）
	@Insert(value="insert into  people values(null ,#{pname},#{password},#{sex},#{birthday}) ")
	public int add(People people);
	
	@Delete("delete from people where id=#{id}")
	public int delete(int id);
	
	@Update("update people set pname=#{pname},password=#{password},sex=#{sex},birthday=#{birthday} where id=#{id}")
	public int update(People people);
	
	@Select(value="select * from people where id=#{id} ")
	public People findById(int id);
	
	@Select(value="select * from people")
	public List<People> listALl();
	
}
