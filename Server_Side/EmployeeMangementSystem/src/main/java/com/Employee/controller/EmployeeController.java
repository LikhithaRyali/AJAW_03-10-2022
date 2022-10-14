package com.Employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.Employee;
import com.Employee.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;

	@GetMapping("/hello")
	public String greetings() {
		return "Hello World!!!";
	}
	
	@PostMapping("/saveemp")
	Integer createEmployee(@RequestBody Employee employee) {
		Integer id = employeeService.saveEmployee(employee);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/allemp")
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/emp/{id}")
	public Optional<Employee> gerEmployee(@PathVariable Integer id) {
		Optional<Employee> employee = employeeService.getEmployee(id);
		return employee;
	}
}
