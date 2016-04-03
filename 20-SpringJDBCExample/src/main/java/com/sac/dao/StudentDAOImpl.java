package com.sac.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sac.bean.Student;
import com.sac.mapper.StudentMapper;

public class StudentDAOImpl implements StudentDAO{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String name, Integer age) {

		String SQL = " INSERT INTO TEST.STUDENTS(NAME,AGE) VALUES(?,?) ";
		jdbcTemplate.update(SQL,name,age);
		System.out.println("Created Record Name = " + name + " Age = " + age);

	}

	@Override
	public Student getStudent(Integer id) {

		String SQL = "SLECT * FROM TEST.STUDENTS WHERE ID = ?";
		Student student = jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {

		String SQL = "SELECT * FROM TEST.STUDENTS";
		List <Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {

		String SQL = "DELETE FROM TEST.STUDENS WHERE ID = ?";
		jdbcTemplate.update(SQL, id);
		return;
	}
	
	@Override
	public void update(Integer id, Integer age) {
		
		String SQL = "UPDATE TEST.STUDENTS SET AGE = ? WHERE ID = ?";
		jdbcTemplate.update(SQL, age, id);

	}
}
