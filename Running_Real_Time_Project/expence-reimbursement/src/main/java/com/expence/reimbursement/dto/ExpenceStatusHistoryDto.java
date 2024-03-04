package com.expence.reimbursement.dto;

import java.time.LocalDateTime;

import com.expence.reimbursement.entity.AuditLog;
import com.expence.reimbursement.entity.EmployeeEntity;
import com.expence.reimbursement.entity.ExpenceEntity;

public class ExpenceStatusHistoryDto extends AuditLog
{
private int id;
	
	private ExpenceEntity expence;
	
	private String expenceStatus;
	
	private EmployeeEntity employee;
	
	private LocalDateTime expenceStatusDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ExpenceEntity getExpence() {
		return expence;
	}

	public void setExpence(ExpenceEntity expence) {
		this.expence = expence;
	}

	public String getExpenceStatus() {
		return expenceStatus;
	}

	public void setExpenceStatus(String expenceStatus) {
		this.expenceStatus = expenceStatus;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public LocalDateTime getExpenceStatusDateTime() {
		return expenceStatusDateTime;
	}

	public void setExpenceStatusDateTime(LocalDateTime expenceStatusDateTime) {
		this.expenceStatusDateTime = expenceStatusDateTime;
	}
	

}
