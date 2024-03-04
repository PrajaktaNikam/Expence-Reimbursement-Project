package com.expence.reimbursement.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.expence.reimbursement.dto.BranchesDto;
import com.expence.reimbursement.dto.EmployeeDto;
import com.expence.reimbursement.entity.BranchesEntity;
import com.expence.reimbursement.entity.EmployeeEntity;
import com.expence.reimbursement.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeService service;
	@Autowired
	ModelMapper mapper;
	@PostMapping("/insert/employee")
	@ResponseBody
	public   ResponseEntity<EmployeeDto> insertValues(@RequestBody EmployeeDto deo)
	{
		
		//dto to entity
		EmployeeEntity request=mapper.map(deo, EmployeeEntity.class);
		EmployeeEntity response=service.insertValues(request);
		
		//entity to dto
		EmployeeDto req=mapper.map(response, EmployeeDto.class);
		return new ResponseEntity<EmployeeDto>(req,HttpStatus.CREATED);
		
		
	}
	@PostMapping("/delete/emp")
	@ResponseBody
	public String deleteValues(@RequestBody EmployeeDto dto)
	{
		service.deleteValues(dto);
		return "values are deleted";
	}
	@PostMapping("/update/emp")
	@ResponseBody
	public String updateEmployee(@RequestBody EmployeeDto req)
	{
		service.updateEmployee(req);
		return "employee updated successfully-----";
	}

}
