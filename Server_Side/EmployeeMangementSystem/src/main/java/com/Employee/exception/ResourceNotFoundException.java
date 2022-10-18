package com.Employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	public static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Integer fieldValue;
	
	
	public String getResourceName() {
		return resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public Integer getFieldValue() {
		return fieldValue;
	}
	
	public ResourceNotFoundException(String resourceName, String fieldName, Integer fieldValue) {
		super(String.format("%s is not found with %s: %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
