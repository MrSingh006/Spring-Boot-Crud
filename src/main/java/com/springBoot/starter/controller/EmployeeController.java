package com.springBoot.starter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.starter.entity.Employee;
import com.springBoot.starter.service.EmployeeService;

/*@RestController is a convenient annotation that combines @Controller and @ResponseBody,
 * which eliminates the need to annotate every request handling method of controller class
 * with @ResponseBody annotation*/

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	/*
	 * 1) We are using here ResponseEntity<T> here because it returns complete response
	 * details for eg. its Status,Header etc.

	 * 2) @RequestBody annotation allows us to retrieve the request's body and
	 * automatically converts it to Java Object
	 */	
//	@PostMapping
//	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
//	{
//		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
//	}
	
	@PostMapping()
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
}
