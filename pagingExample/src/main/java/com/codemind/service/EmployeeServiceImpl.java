package com.codemind.service;
import  org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.codemind.model.Employee;
import com.codemind.repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Page<Employee> getEmployeebyPaging(Integer pageNo, Integer pageSize) {
		
		return employeeRepository.findAll(PageRequest.of(pageNo, pageSize, Sort.Direction.DESC,"name"));
		
	}

	@Override
	public Page<Employee> getEmployeewithSort(Integer pageNo, Integer pagesize, String prop) {
		// TODO Auto-generated method stub
		 Pageable pageable= null;
		if(null!=prop) {
			pageable= PageRequest.of(pageNo, pagesize, Sort.Direction.DESC, prop);
		}else {
			pageable= PageRequest.of(pageNo, pagesize, Sort.Direction.DESC, "id");
		}
		
		return employeeRepository.findAll(pageable);
	}
	
//	@PostConstruct
//	public void initDb() {
//		 List<Employee> employees= IntStream.rangeClosed(1, 200)
//				 .mapToObj(i -> new Employee( i,"Employee"+i, new Random().nextDouble(100)))
//				 .collect(Collectors.toList());
//		 employeeRepository.saveAll(employees);
//	}
}
