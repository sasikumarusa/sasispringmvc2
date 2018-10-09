package com.hexa.employee.register;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hexa.employee.service.HexaServiceInterface;

@Controller
public class EmployeeController {
	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
	private HexaServiceInterface service;
		
	@ModelAttribute("grades")
	public List<String> getGradeList()
	{
		
		return service.getGrade();
	}
	@ModelAttribute("hobs")
	public List<String> getHobList()
	{
		
		return service.getHobbies();
	}
	
	@ModelAttribute("genders")
	public List<String> getGenderList()
	{
		return service.getGender();
	}
	@RequestMapping("/login.htm")
	public ModelAndView homePage(ModelMap map)
	{
		  Employee employee = new Employee();    	  
	      map.addAttribute("employee",employee);
		return new ModelAndView("login");
	}
	
	@RequestMapping("/userlogin.htm")
	public ModelAndView validateUser(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("employee") Employee employee) throws Exception
	{
		logger.info("employee :"+employee);
		
		ModelAndView mView=new ModelAndView();
		mView.addObject("ENAME", employee.getName());
		// check the user name and password. If both are equal redirect to success page else error page. 
		if(employee.getName().equalsIgnoreCase(employee.getPassword()))
		{
			
			//mView.getModelMap().addAttribute("USERNAME",employee.getName());
			mView.setViewName("employeesuccess");
			//mView=new ModelAndView("employeesuccess","employee",employee);
			
		}
		else
		{
			mView.addObject("ERROR", "Invalid Credentials");
			mView.setViewName("login");
		}
		return mView;
	}
	
	
}
