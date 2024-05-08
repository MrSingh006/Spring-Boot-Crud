package com.springBoot.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.starter.entity.Employee;

/*Spring Data Jpa internally provides @Repository annotation and @Transactional annotation 
 * so we do not need to add @Repository annotation to our EmployeeRepository(EmployeeDao) interface.
 * It takes Entity and ID type(Long) as an argument*/ 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
