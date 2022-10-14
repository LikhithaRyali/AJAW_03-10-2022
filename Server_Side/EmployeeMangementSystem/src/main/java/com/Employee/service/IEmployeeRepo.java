package com.Employee.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
