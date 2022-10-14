package com.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeRepo employeeRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee savedEmployee = employeeRepo.save(employee);
		return savedEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}

	

}
