package com.providerdirectory.service.impl;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.providerdirectory.repo.IProviderDirectoryRepo;
import com.providerdirectory.service.IProviderDirectoryService;

@Service
public class ProviderDirectoryServiceImpl implements IProviderDirectoryService {

	@Inject
	IProviderDirectoryRepo providerDirectoryRepo;
	
	public String greeting() {
		return providerDirectoryRepo.greeting();
	}
}
