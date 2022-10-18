package com.Employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		Optional<Employee> employee = employeeService.getEmployee(id);
		return employee;
	}
	
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id) {
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			employeeService.deleteEmployee(id);
		}
		catch(Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
}
