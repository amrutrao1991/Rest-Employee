package com.employee.RestEmployee.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.employee.RestEmployee.dao.EmployeeDAO;
import com.employee.RestEmployee.service.EmployeeDaoServie;

@Component
public class EmployeeModel {
	private EmployeeDAO objEmployeeDao = new EmployeeDAO();
    @Autowired 
    private EmployeeDaoServie empServiceDao;
	public EmployeeDAO FindById(int eid) 
	{
		objEmployeeDao=empServiceDao.FindById(eid);
		return objEmployeeDao;
	}
	public List<EmployeeDAO> findAllEmployee() 
	{	
		return empServiceDao.findAllEmployee();
	}

	public int saveEmployee(EmployeeDAO employeeDao)
	{
		return empServiceDao.insert(employeeDao);
	}
	public EmployeeDAO deleteEmployee(int eid)
	{
		return empServiceDao.deleteEmployee(eid);		
	}
}
