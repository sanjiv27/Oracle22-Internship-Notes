package com.training.oracle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.oracle.model.Employee;
import com.training.oracle.services.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empservice;

	@PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> insert(@RequestBody Employee e) {
		System.out.println("Insert to emp...!!!");
		return empservice.addEmployee(e);
	}

	@GetMapping("/getid/{id}")
	public Employee getById(@PathVariable("id") Integer empid) {
		return empservice.findEmployeeById(empid);
	}

	@GetMapping("/getall")
	public List<Employee> findAllEmployees() {
		return empservice.findAllEmployees();
	}
}