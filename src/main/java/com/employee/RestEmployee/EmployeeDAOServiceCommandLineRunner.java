package com.employee.RestEmployee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.employee.RestEmployee.dao.EmployeeDAO;
import com.employee.RestEmployee.service.EmployeeDaoServie;

public class EmployeeDAOServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(EmployeeDAOServiceCommandLineRunner.class);
	@Autowired
	private EmployeeDaoServie employeeDaoService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeDAO employee = new EmployeeDAO("Ram Patil", "Software Engineer");
		int eid = employeeDaoService.insert(employee);
		log.info("New User is Created : " + employee);
		log.info("Creaated Employee Id : " + eid);
	}
}
