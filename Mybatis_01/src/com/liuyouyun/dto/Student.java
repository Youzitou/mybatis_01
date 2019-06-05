package com.liuyouyun.dto;

import java.util.Date;
/**
 * 必须提供无参构造器
 */
public class Student {
	private int id;
	private String stuname;
	private int age;
	private String sex;
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuname=" + stuname + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday
				+ "]";
	}
	
	
	
}
