package com.hexa.employee.register;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	String name;
	String password;
	String grade;
	String email;	
	String hobbies[];
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", grade="
				+ grade + ", email=" + email + ", hobbies=" + hobbies
				+ ", gender=" + gender + "]";
	}
	

}
