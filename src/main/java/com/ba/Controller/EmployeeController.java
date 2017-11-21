package com.ba.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ba.beans.Employee;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	Employee employee=new Employee();
	
	@RequestMapping(value="/details{name}",method=RequestMethod.GET,produces="application/json")
	public Employee getDetailsInJson(@PathVariable String name){
		employee.setEmpId(102);
		employee.setEmpName("piyush");
		employee.setSalary(50000.0);
		employee.setCompany("centaur infotech solution");
		return employee;
}
	@RequestMapping(value="/details{name}.xml",method=RequestMethod.GET,produces="application/xml")
	public Employee getDetailsInXml(@PathVariable String name){
		employee.setEmpId(102);
		employee.setEmpName("piyush");
		employee.setSalary(50000.0);
		employee.setCompany("centaur infotech solution");
		return employee;
}
}