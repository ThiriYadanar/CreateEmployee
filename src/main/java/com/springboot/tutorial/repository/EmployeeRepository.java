package com.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tutorial.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
