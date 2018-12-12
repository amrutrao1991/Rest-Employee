package com.employee.RestEmployee.dao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class TaskDAO {
	@Id
	@GeneratedValue
	private int taskId;
	@Column(name = "description")
	private String desc;
	@Column(name = "target_date")
	private Date targetDate;
	@Column(name = "is_done")
	private boolean isDone;

	public TaskDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskDAO(String desc, Date targetDate, boolean isDone) {
		super();
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getTaskId() {
		return taskId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return String.format("Task [taskId=%s, desc=%s, targetDate=%s, isDone=%s]", taskId, desc, targetDate, isDone);
	}
}
