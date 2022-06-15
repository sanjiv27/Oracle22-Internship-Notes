package com.training.oracle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpSB")
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "dept_name")
	private String deptName;
	private double salary;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
