package com.springboot.springbootemployee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootemployee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findByDept(String dept);
}
