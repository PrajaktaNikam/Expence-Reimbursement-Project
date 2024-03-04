package com.expence.reimbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expence.reimbursement.entity.ExpenceStatusHistoryEntity;

@Repository
public interface ExpenceStatusHistoryRepository extends JpaRepository<ExpenceStatusHistoryEntity, Integer>
{
	
	

}
