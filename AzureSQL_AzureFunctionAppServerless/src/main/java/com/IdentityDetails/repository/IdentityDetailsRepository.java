package com.IdentityDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.IdentityDetails.model.IdentificationIdDetails;

@Repository
public interface IdentityDetailsRepository extends CrudRepository<IdentificationIdDetails, String> {
	
	@Query("FROM IdentificationIdDetails")
    public List<IdentificationIdDetails> getAll();
}
