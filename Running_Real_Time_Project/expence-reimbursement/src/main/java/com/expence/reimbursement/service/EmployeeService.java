package com.expence.reimbursement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.reimbursement.dto.EmployeeDto;
import com.expence.reimbursement.entity.BranchesEntity;
import com.expence.reimbursement.entity.EmployeeEntity;
import com.expence.reimbursement.entity.OrganizationEntity;
import com.expence.reimbursement.repository.BranchesRepository;
import com.expence.reimbursement.repository.EmployeeRepository;
@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository repo;
	@Autowired
	BranchesRepository branchrepo;

	public EmployeeEntity insertValues(EmployeeEntity request) 
	{
		
		
		
		
		Optional<BranchesEntity> organizationEntity=branchrepo.findById(request.getBranch().getBranchId());
		request.setBranch(organizationEntity.get());	
		return repo.save(request);
		
		
	}

	public void deleteValues(EmployeeDto dto) {
		
		repo.deleteById(dto.getEmployeeId());
		
	}

	public EmployeeEntity updateEmployee(EmployeeDto req) 
	{
		EmployeeEntity entity=new EmployeeEntity();
		entity.setEmployeeId(req.getEmployeeId());
		entity.setEmployeeName(req.getEmployeeName());
		entity.setEmployeeDesignation(req.getEmployeeDesignation());
		entity.setEmployeedepartment(req.getEmployeedepartment());
		entity.setAuditorId(req.getAuditorId());
		entity.setFinanceId(req.getFinanceId());
		entity.setBranch(req.getBranch());
		repo.save(entity);
		return new EmployeeEntity();
	}

}
