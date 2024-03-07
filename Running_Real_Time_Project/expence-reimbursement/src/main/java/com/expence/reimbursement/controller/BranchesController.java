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
import com.expence.reimbursement.dto.OrganizationDto;
import com.expence.reimbursement.entity.BranchesEntity;
import com.expence.reimbursement.entity.OrganizationEntity;
import com.expence.reimbursement.service.BranchesService;

@RestController
public class BranchesController
{
	@Autowired
	BranchesService service;
	@Autowired
	ModelMapper modelmapper;
	@PostMapping("/insert/branch")
	@ResponseBody
	public ResponseEntity<BranchesDto> insertBranchValues(@RequestBody BranchesDto dto)
	{
		//dto to entity
				BranchesEntity request=modelmapper.map(dto, BranchesEntity.class);
				BranchesEntity response=service.insertBranchValues(request);
				//entity to dto
				BranchesDto req=modelmapper.map(response, BranchesDto.class);
				return new ResponseEntity<BranchesDto>(req,HttpStatus.CREATED);
	}
	@PostMapping("/delete/branch")
	@ResponseBody
	public String deleteBranch(@RequestBody BranchesDto dto)
	{
		service.deleteBranch(dto);
		
		return "branch deleted successfully";
	}
	@PostMapping("update/branch")
	@ResponseBody
	public ResponseEntity<BranchesDto> updateBranch(@RequestBody BranchesDto dto)
	{
		//dto to entity
		BranchesEntity request=modelmapper.map(dto, BranchesEntity.class);
		BranchesEntity response=service.updateBranch(request);
		//entity to dto
		BranchesDto req=modelmapper.map(response, BranchesDto.class);
		return new ResponseEntity<BranchesDto>(req,HttpStatus.CREATED);
		
	}
      @GetMapping("/getBranch/{id}")
        public void getBarnch(@PathVariable("id") Integer i){
         
         

        }
 

}
