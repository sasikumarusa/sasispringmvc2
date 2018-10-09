package com.hexa.employee.service;

import java.util.List;

import com.hexa.employee.register.Employee;

public interface HexaServiceInterface {
	
	public  List<String> getHobbies();
	public List<String> getGender();
	public List<String> getGrade();
	public void addEmployee(Employee e);

}
