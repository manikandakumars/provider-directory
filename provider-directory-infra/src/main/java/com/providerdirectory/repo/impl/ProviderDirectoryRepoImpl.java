package com.providerdirectory.repo.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.providerdirectory.repo.IProviderDirectoryRepo;

@Service
public class ProviderDirectoryRepoImpl implements IProviderDirectoryRepo{

	public String greeting() {
		return "Hello - Provider Directory - Repo";
	}
}
