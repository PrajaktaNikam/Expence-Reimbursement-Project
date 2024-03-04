package com.expence.reimbursement.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.reimbursement.dto.ExpenceStatusHistoryDto;
import com.expence.reimbursement.entity.ExpenceStatusHistoryEntity;
import com.expence.reimbursement.repository.EmployeeRepository;
import com.expence.reimbursement.repository.ExpenceRepository;
import com.expence.reimbursement.repository.ExpenceStatusHistoryRepository;

@Service
public class ExpenceStatusHistoryService {

	@Autowired
	ExpenceStatusHistoryRepository repo;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ExpenceRepository expenceRepository;
	
	public ExpenceStatusHistoryEntity insertStatusHistoryValues()
	{
		ExpenceStatusHistoryEntity entity=new ExpenceStatusHistoryEntity();
		//entity.setId((dto.getId()));
		entity.setExpence(entity.getExpence());
		entity.setExpenceStatus("success");
		entity.setEmployee(entity.getEmployee());
		entity.setExpenceStatusDateTime(LocalDateTime.now());
		entity.getExpenceStatus();
		entity.getExpenceStatusDateTime();
		repo.save(entity);
		
		
		return entity;
	}
	public ExpenceStatusHistoryDto insertValues(ExpenceStatusHistoryDto dto) 
	{
		ExpenceStatusHistoryEntity e=new ExpenceStatusHistoryEntity();
		e.setExpence(dto.getExpence());
		e.setExpenceStatus(dto.getExpenceStatus());
		e.setEmployee(dto.getEmployee());
		e.setExpenceStatusDateTime(dto.getExpenceStatusDateTime());
		repo.save(e);
		
		return dto;
	}
	public ExpenceStatusHistoryDto updateValues(ExpenceStatusHistoryDto dto) {
		ExpenceStatusHistoryEntity history=new ExpenceStatusHistoryEntity();
		history.setId(dto.getId());
		history.setExpenceStatus(dto.getExpenceStatus());
		history.setExpenceStatusDateTime(dto.getExpenceStatusDateTime());
		history.setEmployee(dto.getEmployee());
		history.setExpence(dto.getExpence());
		repo.save(history);
		return dto;
	}
	public void deleteValues(ExpenceStatusHistoryDto dto) 
	{
		repo.deleteById(dto.getId());
		
		
	}

}
