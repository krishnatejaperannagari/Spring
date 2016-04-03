package com.sac.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sac.bean.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rsResultSet, int arg1) throws SQLException {
		
		Student student = new Student();
		student.setId(rsResultSet.getInt("id"));
		student.setName(rsResultSet.getString("name"));
		student.setAge(rsResultSet.getInt("age"));
		
		return student;
	}
	
	
}
