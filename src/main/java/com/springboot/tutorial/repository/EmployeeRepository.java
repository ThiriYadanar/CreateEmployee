package com.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tutorial.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
