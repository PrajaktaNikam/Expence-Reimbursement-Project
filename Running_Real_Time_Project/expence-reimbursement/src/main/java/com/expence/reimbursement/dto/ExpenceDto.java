package com.expence.reimbursement.dto;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.expence.reimbursement.entity.AuditLog;
import com.expence.reimbursement.entity.EmployeeEntity;

public class ExpenceDto extends AuditLog
{
	private int id;
	
	private String expenceType;
	
	private double expenceAmount;
	
	private String expenceLocation;
	
	private String expenceAttachment;
	
	private String expenceStatus;
	
	private EmployeeEntity employee;
	
	private LocalDate expenceDate;
	
	private LocalDateTime expenceTime;

	

	public LocalDate getExpenceDate() {
		return expenceDate;
	}

	public void setExpenceDate(LocalDate expenceDate) {
		this.expenceDate = expenceDate;
	}

	public LocalDateTime getExpenceTime() {
		return expenceTime;
	}

	public void setExpenceTime(LocalDateTime expenceTime) {
		this.expenceTime = expenceTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExpenceType() {
		return expenceType;
	}

	public void setExpenceType(String expenceType) {
		this.expenceType = expenceType;
	}

	public double getExpenceAmount() {
		return expenceAmount;
	}

	public void setExpenceAmount(double expenceAmount) {
		this.expenceAmount = expenceAmount;
	}

	public String getExpenceLocation() {
		return expenceLocation;
	}

	public void setExpenceLocation(String expenceLocation) {
		this.expenceLocation = expenceLocation;
	}

	public String getExpenceAttachment() {
		return expenceAttachment;
	}

	public void setExpenceAttachment(String expenceAttachment) {
		this.expenceAttachment = expenceAttachment;
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

	
	
	
	
	
	
	

}
