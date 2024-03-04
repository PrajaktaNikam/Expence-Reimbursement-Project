package com.expence.reimbursement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.reimbursement.dto.OrganizationDto;
import com.expence.reimbursement.entity.OrganizationEntity;
import com.expence.reimbursement.repository.OrganizationRepository;

@Service
public class OrganizationService
{
	@Autowired
	OrganizationRepository repo;

	public OrganizationDto insertValues(OrganizationDto dto)
	{
		
		OrganizationEntity org=new OrganizationEntity();
		org.setOrganizationName(dto.getOrganizationName());
		org.setOrganizationAddress(dto.getOrganizationAddress());
		repo.save(org);
		
		
		return dto;
		
	}

	public void updateValues(OrganizationDto req)
	{
		OrganizationEntity entity=new OrganizationEntity();
		entity.setOrganizationId(req.getOrganizationId());
		entity.setOrganizationName(req.getOrganizationName());
		entity.setOrganizationAddress(req.getOrganizationAddress());
		repo.save(entity);
		
		
	}

	public void deleteValues(OrganizationDto req) 
	{
		repo.deleteById(req.getOrganizationId());
		
		
	}

	public OrganizationEntity addValue(OrganizationEntity request) {
		return repo.save(request);
	}

}
