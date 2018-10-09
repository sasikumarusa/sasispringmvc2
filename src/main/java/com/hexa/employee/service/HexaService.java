package com.hexa.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.employee.dao.HexaDAOInterface;
import com.hexa.employee.register.Employee;

public class HexaService implements HexaServiceInterface{
	
	@Autowired
	private HexaDAOInterface daoInterface;
	
	@Override
	@Transactional
	public List<String> getHobbies() {
		
		return daoInterface.getHobbiesDAO();
	}

	@Override
	@Transactional
	public List<String> getGender() {
		return daoInterface.getGenderDAO();
	}

	@Override
	@Transactional
	public List<String> getGrade() {

		return daoInterface.getGradeDAO();
	}

	@Override
	public void addEmployee(Employee e) {	
		
	}

}
