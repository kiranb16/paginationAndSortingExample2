package com.codemind.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.codemind.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
