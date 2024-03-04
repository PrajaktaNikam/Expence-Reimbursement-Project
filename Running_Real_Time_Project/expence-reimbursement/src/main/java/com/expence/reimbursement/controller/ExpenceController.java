package com.expence.reimbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expence.reimbursement.dto.ExpenceDto;
import com.expence.reimbursement.entity.ExpenceEntity;
import com.expence.reimbursement.service.ExpenceService;

@RestController
public class ExpenceController
{
	@Autowired
	ExpenceService service;
	@GetMapping("/insert/expence")
	public ExpenceEntity insertExpenceValues()
	{
		ExpenceEntity result=service.insertExpenceValues();
		
		return result;
	}
	@PostMapping("/sss")
	public ExpenceDto insertValues(@RequestBody ExpenceDto dto)
	{
		 ExpenceDto result=service.insert(dto);
		return result;
	}
	@GetMapping("/delete")
	public String deleteAll()
	{
		service.deleteAll();
		return "employee deleted successfully";
	}
	@PostMapping("/update/expence")
	public ExpenceDto updateExpence(@RequestBody ExpenceDto dto)
	{
		ExpenceDto result=service.updateExpence(dto);
		return result;
		
	}
	

}
