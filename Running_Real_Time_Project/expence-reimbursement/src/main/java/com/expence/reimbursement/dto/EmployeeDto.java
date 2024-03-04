package com.expence.reimbursement.dto;

import com.expence.reimbursement.entity.AuditLog;
import com.expence.reimbursement.entity.BranchesEntity;

public class EmployeeDto extends AuditLog
{
    private int employeeId;
    
    private String employeeName;
    
    private String employeeDesignation;
    
    private String employeedepartment;
    
    private int reportingEmployeeId;
    
    private int auditorId;
    
    private int financeId;
    
    private BranchesEntity branch;

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
