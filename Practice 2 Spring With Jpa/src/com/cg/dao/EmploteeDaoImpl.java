package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

@Repository
public class EmploteeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.persist(employee);
		entityManager.flush();
		return employee;
	}

	@Override
	public List<Employee> loadAll() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> query=entityManager.createQuery("Select e from Employee e",Employee.class);
		return query.getResultList();
	}

}
