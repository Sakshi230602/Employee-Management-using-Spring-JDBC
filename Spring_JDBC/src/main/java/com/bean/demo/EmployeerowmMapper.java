package com.bean.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class EmployeerowmMapper implements  RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.setId(rs.getInt("id"));
		std.setName(rs.getString("name"));
		std.setMarks(rs.getString("marks"));
		return std;
	}

	
}
