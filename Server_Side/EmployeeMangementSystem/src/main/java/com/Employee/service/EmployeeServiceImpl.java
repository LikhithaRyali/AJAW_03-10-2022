package com.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.Employee;
import com.Employee.exception.ResourceNotFoundException;

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

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		// TODO Auto-generated method stub
		Employee existingEmployee = employeeRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "id", id));
		
		existingEmployee.setName(employee.getName());
		existingEmployee.setEmp_position(employee.getEmp_position());
		existingEmployee.setQualification(employee.getQualification());
		existingEmployee.setSalary(employee.getSalary());
		
		employeeRepo.save(existingEmployee);
		
		return existingEmployee;
	}

	

}
