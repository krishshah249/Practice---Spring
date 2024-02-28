package com.cg.dao;

import java.util.List;

import com.cg.entity.Employee;

public interface EmployeeDao {
	public abstract Employee save(Employee employee);
	public abstract List<Employee> loadAll();
}
