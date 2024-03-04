package com.expence.reimbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expence.reimbursement.dto.ExpenceStatusHistoryDto;
import com.expence.reimbursement.entity.ExpenceStatusHistoryEntity;
import com.expence.reimbursement.service.ExpenceStatusHistoryService;

@RestController
public class ExpenceStatusHistoryController 
{
	@Autowired
	ExpenceStatusHistoryService service;
	
	@GetMapping("/insert/status/history")
	public ExpenceStatusHistoryEntity insertStatusHistoryValues()
	{
		 ExpenceStatusHistoryEntity result=service.insertStatusHistoryValues();
		 return result;
	}
	@PostMapping("insert/post/value")
	public ExpenceStatusHistoryDto insertValues(@RequestBody ExpenceStatusHistoryDto dto)
	{
		ExpenceStatusHistoryDto result=service.insertValues(dto);
		return result;
		
	}
	@PostMapping("/update/status/history/values")
	public ExpenceStatusHistoryDto updateValues(@RequestBody ExpenceStatusHistoryDto dto)
	{
		ExpenceStatusHistoryDto result=service.updateValues(dto);
		return dto;
	}
	@PostMapping("/delete/value")
	public String deleteValues(@RequestBody ExpenceStatusHistoryDto dto)
	{
		service.deleteValues(dto);
		return "values deleted successfully---";
	}

}
