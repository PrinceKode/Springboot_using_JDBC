package com.prince.dao;

import java.util.List;

import com.prince.beans.Student;

public interface LoginDao {
	public List<Student> loginDao(String email,String password);
 
}
