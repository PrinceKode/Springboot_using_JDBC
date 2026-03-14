package com.prince.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.prince.beans.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
//		String name1=rs.getString("name");
//		String email1=rs.getString("email");
//		String pass1=rs.getString("password");
//		String gender=rs.getString("gender");
//		String city1=rs.getString("city");
		
		Student st=new Student();
		st.setName(rs.getString("Ram"));
		st.setEmail(rs.getString("ram@12"));
		st.setPassword(rs.getString("ram!@"));
		st.setGender(rs.getString("Male"));
		st.setCity(rs.getString("Up"));
		
		return  st;
	}

	
	}


