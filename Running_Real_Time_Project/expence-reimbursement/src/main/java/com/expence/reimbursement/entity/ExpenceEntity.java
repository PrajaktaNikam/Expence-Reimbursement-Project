package com.expence.reimbursement.entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="expence_details")
public class ExpenceEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private int id;
	
	@Column(name="expence_type")
	private String expenceType;
	
	@Column(name="expence_amount ")
	private double expenceAmount;
	
	@Column(name="expence_location")
	private String expenceLocation;
	
	@Column(name="expence_attachmemt")
	private String expenceAttachment;
	
	@Column(name="expence_status")
	private String expenceStatus;
	
	@JoinColumn(name="employee_id ")
	@OneToOne(fetch=FetchType.LAZY)
	private EmployeeEntity employee;
	
	@Column(name="expence_date")
	private LocalDate expenceDate;
	
	@Column(name="expence_time")
	private LocalDateTime expenceTime;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "expence")
	private List<ExpenceStatusHistoryEntity> expenceHistory;

	public List<ExpenceStatusHistoryEntity> getExpenceHistory() {
		return expenceHistory;
	}

	public void setExpenceHistory(List<ExpenceStatusHistoryEntity> expenceHistory) {
		this.expenceHistory = expenceHistory;
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
	
	
	

}
