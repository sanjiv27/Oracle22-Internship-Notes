package com.training.oracle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.oracle.dao.EmployeeDAO;
import com.training.oracle.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeDAO empdao;

	@Override
	public List<Employee> addEmployee(Employee e) {
		System.out.println("Service:add");
		empdao.save(e);
		return empdao.findAll();
	}

	@Override
	public List<Employee> deleteEmployee(Integer empid) {
		System.out.println("Service:delete");
		empdao.deleteById(empid);
		return empdao.findAll();
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		System.out.println("Service:update");
		empdao.saveAndFlush(e);
		return empdao.findAll();
	
	}

	@Override
	public Employee findEmployeeById(Integer empid) {
		System.out.println("Service:findById");		
	 	Optional<Employee> emp =  empdao.findById(empid);		
		return emp.get();
	}

	@Override
	public List<Employee> findAllEmployees() {
		System.out.println("Service:findAll");
		return empdao.findAll();
	}

}
