package com.employee.RestEmployee.dao;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name = "Employee")
public class EmployeeDAO {
	@Id
	@Column(name = "Emp_Id")
	@GeneratedValue
	private int eid;
	@Column(name = "Emp_Name")
	private String ename;
	@Column(name = "Emp_Designation",unique=true)
	private String edesg;

	public EmployeeDAO() {
		super();
	}

	public EmployeeDAO(String ename, String edesg) {
		super();
		this.ename = ename;
		this.edesg = edesg;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesg() {
		return edesg;
	}

	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}

	@Override
	public String toString() {
		return String.format("EmployeeDAO [eid=%s, ename=%s, edesg=%s]", eid, ename, edesg);
	}
}
