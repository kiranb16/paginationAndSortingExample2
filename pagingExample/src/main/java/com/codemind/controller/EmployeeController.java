package com.codemind.controller;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.model.Employee;
import com.codemind.service.EmployeeService;

@RestController
public class EmployeeController {
 @Autowired
 EmployeeService employeeService;
 
 
 @GetMapping("/employeewithPaging/{pageNo}/{pageSize}")
 
 public Page<Employee> getEmpoyeeByPaging(@PathVariable Integer pageNo,
		 @PathVariable Integer pageSize){
	 return employeeService.getEmployeebyPaging(pageNo, pageSize);
 }
 
 @GetMapping("/employeeWithSorting/{pageNo}/{pagesize}/{prop}")
 public Page<Employee> employeeWithSorting(@PathVariable Integer pageNo, @PathVariable Integer pagesize, @PathVariable String prop){
	 return  employeeService.getEmployeewithSort(pageNo, pagesize, prop);
 }
}
