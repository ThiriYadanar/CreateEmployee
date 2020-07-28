package com.springboot.tutorial.service;

import java.util.List;
import com.springboot.tutorial.entity.Employee;
public interface EmployeeService {

	List<Employee> listAll();

	List<Employee> getSearchData(String search_data);

	void save(Employee employee);

}
