package com.expence.reimbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expence.reimbursement.entity.BranchesEntity;

@Repository
public interface BranchesRepository extends JpaRepository<BranchesEntity, Integer>
{

}
