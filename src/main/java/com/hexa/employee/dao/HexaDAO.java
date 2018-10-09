package com.hexa.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;


public class HexaDAO  implements HexaDAOInterface{
	
	
	@Autowired
	private DataSource dataSource;
	
	public HexaDAO(){
		/*try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/lms","postgres","");
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}
	public Connection getConnection() throws SQLException
	{
		return dataSource.getConnection();
	}
	@Override
	public List<String> getHobbiesDAO() {
		PreparedStatement st;
		List<String> hobbies=new ArrayList<String>();
			try {
			st = getConnection().prepareStatement("select hobbie from hobbies");
			ResultSet res=st.executeQuery();
			while(res.next()){
				hobbies.add(res.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return hobbies;
	}

	@Override
	public List<String> getGenderDAO() {
		PreparedStatement st;
		List<String> genders=new ArrayList<String>();
			try {
			st = getConnection().prepareStatement("select gender from genders");
			ResultSet res=st.executeQuery();
			while(res.next()){
				genders.add(res.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return genders;
	}

	@Override
	public List<String> getGradeDAO() {
		PreparedStatement st;
		List<String> grades=new ArrayList<String>();
			try {
			st = getConnection().prepareStatement("select grade from grades");
			ResultSet res=st.executeQuery();
			while(res.next()){
				grades.add(res.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return grades;
	}

}
