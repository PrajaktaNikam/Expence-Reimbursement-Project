package com.expence.reimbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expence.reimbursement.entity.ExpenceEntity;

@Repository
public interface ExpenceRepository extends JpaRepository<ExpenceEntity, Integer>
{

}
