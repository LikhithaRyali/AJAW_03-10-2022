package com.Employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Employee.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	List<Employee> list = List.of(
			new Employee(12341L, "Bhargav", "9876543210"),
			new Employee(12342L, "Bhargav1", "9876543210"),
			new Employee(12343L, "Bhargav2", "9876543210"),
			new Employee(12344L, "Bhargav3", "9876543210"),
			new Employee(12345L, "Bhargav4", "9876543210"),
			new Employee(12346L, "Bhargav5", "9876543210"),
			new Employee(12347L, "Bhargav6", "9876543210"),
			new Employee(12348L, "Bhargav7", "9876543210"),
			new Employee(12349L, "Bhargav8", "9876543210")
			);

	
	
	
	
	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee-> employee.getEmpId().equals(id)).findAny().orElse(null);
	}

}
