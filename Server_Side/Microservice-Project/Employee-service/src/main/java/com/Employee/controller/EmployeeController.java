package com.Employee.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Employee.entity.Employee;
import com.Employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Autowired
	private RestTemplate restTemplate;
	//http://localhost:9090/record/emp/1311
	@GetMapping("/{empId}")
	public Employee getEmployee(@PathVariable("empId") Long empId) {
		Employee employee = this.employeeService.getEmployee(empId);
		List employmentRecord = this.restTemplate.getForObject("http://localhost:9090/record/emp/" + empId, List.class);
		employee.setEmploymentRecord(employmentRecord);
		return employee;
	}

}
