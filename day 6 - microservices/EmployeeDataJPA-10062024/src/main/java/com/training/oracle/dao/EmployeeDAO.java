package com.training.oracle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.oracle.model.Employee;


@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
