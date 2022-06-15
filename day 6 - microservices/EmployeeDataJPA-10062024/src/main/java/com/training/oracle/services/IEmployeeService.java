package com.training.oracle.services;

import java.util.List;

import com.training.oracle.model.Employee;

public interface IEmployeeService {

	public List<Employee> addEmployee(Employee e);

	public List<Employee> deleteEmployee(Integer empid);

	public List<Employee> updateEmployee(Employee e);

	public Employee findEmployeeById(Integer empid);

	public List<Employee> findAllEmployees();
}
