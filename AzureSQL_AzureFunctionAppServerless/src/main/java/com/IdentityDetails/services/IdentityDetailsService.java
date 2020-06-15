package com.IdentityDetails.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IdentityDetails.model.IdentificationIdDetails;
import com.IdentityDetails.repository.IdentityDetailsRepository;

@Service
public class IdentityDetailsService {

	@Autowired
	IdentityDetailsRepository sampleRepo;

	public List<IdentificationIdDetails> getAll() {
		return sampleRepo.getAll();
	}
}
