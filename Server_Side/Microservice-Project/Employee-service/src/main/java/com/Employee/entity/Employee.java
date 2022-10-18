package com.Employee.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private Long empId;
	private String name;
	private String phone;
	
	List<EmploymentRecord> employmentRecord = new ArrayList<>();

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<EmploymentRecord> getEmploymentRecord() {
		return employmentRecord;
	}

	public void setEmploymentRecord(List<EmploymentRecord> employmentRecord) {
		this.employmentRecord = employmentRecord;
	}

	public Employee(Long empId, String name, String phone, List<EmploymentRecord> employmentRecord) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		this.employmentRecord = employmentRecord;
	}

	public Employee(Long empId, String name, String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}

	public Employee() {
		super();
	}
	
	

}
