package com.employee.RestEmployee.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.employee.RestEmployee.dao.EmployeeDAO;

@Repository
@Transactional
public class EmployeeDaoServie {
	@PersistenceContext
	private EntityManager entityManager;

	public int insert(EmployeeDAO employee) {
		// open Transaction
		entityManager.persist(employee);
		return employee.getEid();
	}

	public EmployeeDAO FindById(int id) {
		EmployeeDAO emp = new EmployeeDAO();
		emp = entityManager.find(EmployeeDAO.class, id);
		return emp;
	}
	public List<EmployeeDAO> findAllEmployee()
	{
		Query query=entityManager.createQuery("FROM EmployeeDAO");
		List<EmployeeDAO> emplist = query.getResultList();
		return emplist;
	}
	public EmployeeDAO deleteEmployee(int eid)
	{
		EmployeeDAO emp = new EmployeeDAO();
		emp = entityManager.find(EmployeeDAO.class, eid);
		entityManager.remove(emp);
		return emp;
	}
}
