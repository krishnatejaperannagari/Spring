package com.sac.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.sac.bean.Address;
import com.sac.bean.Employee;
import com.sac.mapper.EmployeeMapper;

public class EmployeeDaoImpl implements EmployeeDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager transactionManager;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void create(Map<String, Object> hsMap) {
		
		Employee employee = (Employee) hsMap.get("employee");
		Address address = (Address) hsMap.get("address");
		
		TransactionDefinition definition = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(definition);
		
		try{
			
		String employeeSQL = " INSERT INTO TEST.EMPLOYEE(FIRST_NAME,LAST_NAME,GENDER) "
							  + "VALUES (?,?,?) ";
		jdbcTemplate.update(employeeSQL, employee.getFirstName(),employee.getLastName(),employee.getGender());
		
		String employeeIDSQL = " SELECT MAX(E_ID) FROM TEST.EMPLOYEE ";
		Integer employeeID = (Integer) jdbcTemplate.queryForList(employeeIDSQL).iterator().next().get("MAX(E_ID)");
		
		String addressSQL = " INSERT INTO TEST.ADDRESS(E_ID,ADDRESS_LINE_1,ADDRESS_LINE_2,CITY,STATE,COUNTRY,ZIP_CODE) "
							+ " VALUES (?,?,?,?,?,?,?)";
		jdbcTemplate.update(addressSQL, employeeID,address.getAddressLine1(), address.getAddressLine2(),
					address.getCity(),address.getState(),address.getCountry(),address.getZipCode());
		transactionManager.commit(status);
		}catch(Exception e){
			transactionManager.rollback(status);
		}
		
	}

	@Override
	public Object employeeList() {
		
		String sqlQuery = " SELECT * FROM TEST.EMPLOYEE, TEST.ADDRESS "
						+ " WHERE TEST.EMPLOYEE.E_ID = TEST.ADDRESS.E_ID ";
		
		return jdbcTemplate.query(sqlQuery, new EmployeeMapper());
		
	}

}
