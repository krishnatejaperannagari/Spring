package com.sac.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Address;
import com.sac.bean.Employee;
import com.sac.dao.EmployeeDaoImpl;

public class SpringTransactionMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		EmployeeDaoImpl employeeDaoImpl = (EmployeeDaoImpl) applicationContext.getBean("employeeDaoImpl");
		
		Employee employee = new Employee();
		employee.setFirstName("Sachin");
		employee.setLastName("Naik");
		employee.setGender("Male");
		
		
		Address address = new Address();
		address.setAddressLine1("2000 Bay Area Blvd");
		address.setAddressLine2("Apt 110");
		address.setCity("Houston");
		address.setState("Texas");
		address.setZipCode("77058");
		address.setCountry("India");
		
		Map<String, Object> hsMap = new HashMap<>();
		hsMap.put("employee", employee);
		hsMap.put("address", address);
		
		employeeDaoImpl.create(hsMap);
		
		System.out.println(" **** Records Created **** ");
		
		 List list = (List) employeeDaoImpl.employeeList();
		 if(list.size() >= 1){
		 hsMap = (Map<String, Object>) list.get(0);
		 
		 employee = (Employee) hsMap.get("employee");
		 address = (Address) hsMap.get("address");
		 
		 System.out.println("Employee: " + employee);
		 System.out.println("Address: " + address);
		 }else{
			 System.out.println("No records found");
		 }
		 
		 
		
}

}
