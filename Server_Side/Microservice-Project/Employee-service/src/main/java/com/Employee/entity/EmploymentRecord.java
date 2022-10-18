package com.Employee.entity;

public class EmploymentRecord {
	
	private Long cId;
	private String cName;
	private String cEmail;
	private Integer years;
	
	private Long empId;

	public EmploymentRecord(Long cId, String cName, String cEmail, Integer years, Long empId) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.years = years;
		this.empId = empId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	

}
