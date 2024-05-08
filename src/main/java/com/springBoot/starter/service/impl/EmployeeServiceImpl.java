package com.springBoot.starter.service.impl;

import org.springframework.stereotype.Service;

import com.springBoot.starter.entity.Employee;
import com.springBoot.starter.repository.EmployeeRepository;
import com.springBoot.starter.service.EmployeeService;

/*We do not have to write @Transactional annotation here as Spring Data Jpa internally 
 * provides that annotation*/
@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	/*
	 * 1) Always use constructor based dependency when-ever we have mandatory fields
	 * 2) Always use setter based dependency when-ever we have optional fields
	 */

	/*
	 * Starting Spring 4.3, if a class, which is configured as a Spring bean, has
	 * only one constructor, the @Autowired annotation can be omitted and Spring
	 * will use that constructor and inject all necessary dependencies
	 */
	
	private EmployeeRepository employeeRepository;
	
//	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
