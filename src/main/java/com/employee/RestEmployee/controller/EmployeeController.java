package com.employee.RestEmployee.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.RestEmployee.dao.EmployeeDAO;
import com.employee.RestEmployee.model.EmployeeModel;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeModel objEmployeeModel;

	@GetMapping("/Employee/{eid}")
	public EmployeeDAO getEmployee(@PathVariable int eid) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao = objEmployeeModel.FindById(eid);
		return empDao;
	}

	@GetMapping("/Employee")
	public List<EmployeeDAO> getAllEmployee() {
		List<EmployeeDAO> empList = new LinkedList<EmployeeDAO>();
		empList = objEmployeeModel.findAllEmployee();
		return empList;
	}

	@PostMapping("/New/Employee")
	public EmployeeDAO saveEmployee(@RequestBody EmployeeDAO emoloyeeDao) {
		int id = objEmployeeModel.saveEmployee(emoloyeeDao);
		return emoloyeeDao;
	}
	@DeleteMapping("/employee/delete/{eid}")
	public EmployeeDAO deleteEmployee(@PathVariable int eid)
	{
	  return objEmployeeModel.deleteEmployee(eid);
	}
}
