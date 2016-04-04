package com.sac.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

import com.sac.bean.Address;
import com.sac.bean.Employee;

public class EmployeeMapper implements RowMapper<Object>{

	@SuppressWarnings("unchecked")
	@Override
	public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Employee employee = new Employee();
		Address address = new Address();
		
		employee.seteID(resultSet.getInt("E_ID"));
		employee.setFirstName(resultSet.getString("FIRST_NAME"));
		employee.setLastName(resultSet.getString("LAST_NAME"));
		employee.setGender("GENDER");
		
		address.setaID(resultSet.getInt("A_ID"));
		address.seteID(resultSet.getInt("E_ID"));
		address.setAddressLine1(resultSet.getString("ADDRESS_LINE_1"));
		address.setAddressLine2(resultSet.getString("ADDRESS_LINE_2"));
		address.setCity(resultSet.getString("CITY"));
		address.setState(resultSet.getString("STATE"));
		address.setZipCode(resultSet.getString("ZIP_CODE"));
		
		@SuppressWarnings("rawtypes")
		Map map = new HashMap<>();
		map.put("employee", employee);
		map.put("address", address);
		
	
		return map;
	}

}
