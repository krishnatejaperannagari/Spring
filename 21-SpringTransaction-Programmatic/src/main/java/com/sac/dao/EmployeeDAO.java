package com.sac.dao;

import java.util.Map;

import javax.sql.DataSource;

public interface EmployeeDAO {
	
	public void setDataSource(DataSource dataSource);
	public void create(Map<String, Object> hsMap);
	public Object employeeList();

}
