package com.expence.reimbursement.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.reimbursement.dto.ExpenceDto;
import com.expence.reimbursement.entity.EmployeeEntity;
import com.expence.reimbursement.entity.ExpenceEntity;
import com.expence.reimbursement.repository.ExpenceRepository;

@Service
public class ExpenceService 
{

	@Autowired
	ExpenceRepository repo;
	public ExpenceEntity insertExpenceValues() 
	{
		ExpenceEntity entity=new ExpenceEntity();
		ExpenceDto dto=new ExpenceDto();
		
		entity.setExpenceType("Travel");
		entity.setExpenceAmount(55555.0);
		entity.setExpenceLocation("Chennai");
		entity.setExpenceAttachment("c:/travel");
		entity.setExpenceStatus("pending");
		entity.setEmployee(entity.getEmployee());
		entity.setExpenceDate(LocalDate.now());
		entity.setExpenceTime(LocalDateTime.now());
		
		entity.getExpenceType();
		entity.getExpenceAmount();
		entity.getExpenceLocation();
		entity.getExpenceAttachment();
		entity.getExpenceStatus();
		//sysodto.getExpenceDate();
		System.out.println(entity.getExpenceDate());
		System.out.println(entity.getExpenceTime());
		dto.getExpenceTime();
		repo.save(entity);
		
		
		
		
		return entity;
	}
	public ExpenceDto insert(ExpenceDto dto) 
	{
		ExpenceEntity e=new ExpenceEntity();
		e.setExpenceType(dto.getExpenceType());
		e.setExpenceAmount(dto.getExpenceAmount());
		e.setExpenceLocation(dto.getExpenceLocation());
		e.setExpenceAttachment(dto.getExpenceAttachment());
		e.setExpenceStatus(dto.getExpenceStatus());
		e.setExpenceDate(dto.getExpenceDate());
		e.setExpenceTime(dto.getExpenceTime());
		e.setEmployee(dto.getEmployee());
		repo.save(e);
		
		return dto;
	}
	public void deleteAll() {
		repo.deleteAll();
		
	}
	public ExpenceDto updateExpence(ExpenceDto dto) {
		ExpenceEntity e=new ExpenceEntity();
		e.setId(dto.getId());
		e.setExpenceType(dto.getExpenceType());
		e.setExpenceAmount(dto.getExpenceAmount());
		e.setExpenceLocation(dto.getExpenceLocation());
		e.setExpenceAttachment(dto.getExpenceAttachment());
		e.setExpenceStatus(dto.getExpenceStatus());
		e.setExpenceDate(dto.getExpenceDate());
		e.setExpenceTime(dto.getExpenceTime());
		e.setEmployee(dto.getEmployee());
		repo.save(e);
		return dto;
	}
	
	

}
