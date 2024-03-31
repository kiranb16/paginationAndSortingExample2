package com.codemind.service;

import org.springframework.data.domain.Page;

import com.codemind.model.Employee;

public interface EmployeeService {

	Page<Employee> getEmployeebyPaging(Integer pageNo, Integer pageSize);

	Page<Employee> getEmployeewithSort(Integer pageNo, Integer pagesize, String prop);

}
