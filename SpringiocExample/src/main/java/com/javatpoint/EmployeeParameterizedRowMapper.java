package com.javatpoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
public class EmployeeParameterizedRowMapper implements ParameterizedRowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt("ID"));
		employee.setName(rs.getString("NAME"));
		employee.setSalary(rs.getInt("SALARY"));
		return employee;
		
	}

}
