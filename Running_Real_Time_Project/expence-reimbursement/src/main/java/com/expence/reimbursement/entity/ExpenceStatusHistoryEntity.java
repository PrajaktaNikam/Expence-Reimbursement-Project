package com.expence.reimbursement.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="expence_status_history")
public class ExpenceStatusHistoryEntity extends AuditLog
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JoinColumn(name="expence_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private ExpenceEntity expence;
	
	@Column(name="expence_status")
	private String expenceStatus;
	
	@JoinColumn(name="employee_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private EmployeeEntity employee;
	
	
	@Column(name="expence_status_date_time")
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
