package com.expence.reimbursement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expence.reimbursement.dto.BranchesDto;
import com.expence.reimbursement.entity.BranchesEntity;
import com.expence.reimbursement.entity.OrganizationEntity;
import com.expence.reimbursement.repository.BranchesRepository;
import com.expence.reimbursement.repository.OrganizationRepository;
@Service
public class BranchesService 
{
	@Autowired
	BranchesRepository repo;
	@Autowired 
	OrganizationRepository organizationRepository;

	public BranchesEntity insertBranchValues(BranchesEntity request) 
	{
		Optional<OrganizationEntity> organizationEntity=organizationRepository.findById(request.getOrganizationEntity().getOrganizationId());

		request.setOrganizationEntity(organizationEntity.get());	
		return repo.save(request);
	}

	public void deleteBranch(BranchesDto dto) {
		repo.deleteById(dto.getBranchId());
		
	}

	public BranchesEntity updateBranch(BranchesEntity request) {
		
		return repo.save(request);
	}

	

}
