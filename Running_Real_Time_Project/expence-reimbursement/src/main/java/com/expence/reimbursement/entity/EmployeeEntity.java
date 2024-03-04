package com.expence.reimbursement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
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
@Table(name="employee_details")
public class EmployeeEntity extends AuditLog
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
    private int employeeId;
    
	@Column(name="employee_name")
    private String employeeName;
    
	@Column(name="employee_designation")
    private String employeeDesignation;
    
	@Column(name="employee_deparment")
    private String employeedepartment;
    
	@Column(name="reporting_emp_id")
    private int reportingEmployeeId;
    
	@Column(name="auditor_id")
    private int auditorId;
    
	@Column(name="finance_id")
    private int financeId;
    
	@JoinColumn(name="branch_id")
	@OneToOne(fetch = FetchType.LAZY)
    private BranchesEntity branch;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<ExpenceEntity> list;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "employee")
	private List<ExpenceStatusHistoryEntity> history;
	
	public List<ExpenceStatusHistoryEntity> getHistory() {
		return history;
	}

	public void setHistory(List<ExpenceStatusHistoryEntity> history) {
		this.history = history;
	}

	public List<ExpenceEntity> getList() {
		return list;
	}

	public void setList(List<ExpenceEntity> list) {
		this.list = list;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeedepartment() {
		return employeedepartment;
	}

	public void setEmployeedepartment(String employeedepartment) {
		this.employeedepartment = employeedepartment;
	}

	public int getReportingEmployeeId() {
		return reportingEmployeeId;
	}

	public void setReportingEmployeeId(int reportingEmployeeId) {
		this.reportingEmployeeId = reportingEmployeeId;
	}

	public int getAuditorId() {
		return auditorId;
	}

	public void setAuditorId(int auditorId) {
		this.auditorId = auditorId;
	}

	public int getFinanceId() {
		return financeId;
	}

	public void setFinanceId(int financeId) {
		this.financeId = financeId;
	}

	public BranchesEntity getBranch() {
		return branch;
	}

	public void setBranch(BranchesEntity branch) {
		this.branch = branch;
	}
	
}
