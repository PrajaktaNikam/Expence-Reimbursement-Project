package com.expence.reimbursement.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.expence.reimbursement.dto.OrganizationDto;
import com.expence.reimbursement.entity.OrganizationEntity;
import com.expence.reimbursement.service.OrganizationService;

@RestController
public class OrganizationController 
{
	
	@Autowired
	OrganizationService service;
	@Autowired
	ModelMapper modelmapper;

	
	@PostMapping("/insert")
	@ResponseBody
	public OrganizationDto insertValues(@RequestBody OrganizationDto dto )
	{
		OrganizationDto result= service.insertValues(dto);
		
		return dto;
	}
	@PostMapping("/update")
	@ResponseBody
	public String updateValues(@RequestBody OrganizationDto req)
	{
		service.updateValues(req);
		return "Values updated successfully...";
	}
	@PostMapping("/delete")
	@ResponseBody
	public String deleteValues(@RequestBody OrganizationDto req)
	{
		service.deleteValues(req);
		return "values deleted successfully...";
	}
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<OrganizationDto> addValues(@RequestBody OrganizationDto dto)
	{
		//dto to entity
		OrganizationEntity request=modelmapper.map(dto, OrganizationEntity.class);
		OrganizationEntity response=service.addValue(request);
		//entity to dto
		OrganizationDto req=modelmapper.map(response, OrganizationDto.class);
		return new ResponseEntity<OrganizationDto>(req,HttpStatus.CREATED);
	}

}
