package com.expence.reimbursement.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="organization")
public class OrganizationEntity extends AuditLog
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="organization_id")
	private int organizationId;
	
	@Column(name="organization_name")
	private String organizationName;
	
	@Column(name="organization_address")
	private String organizationAddress;
	
	@OneToMany(mappedBy = "organizationEntity")
	Set<BranchesEntity> branchesEntitySet;

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationAddress() {
		return organizationAddress;
	}

	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

	public Set<BranchesEntity> getBranchesEntitySet() {
		return branchesEntitySet;
	}

	public void setBranchesEntitySet(Set<BranchesEntity> branchesEntitySet) {
		this.branchesEntitySet = branchesEntitySet;
	}
	
	
	
	

}
