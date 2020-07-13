package com.providerdirectory.repo.impl;

import org.springframework.stereotype.Component;

import com.providerdirectory.repo.IProviderDirectoryRepo;

@Component
public class ProviderDirectoryRepoImpl implements IProviderDirectoryRepo{

	public String greeting() {
		return "Hello - Provider Directory - Repo";
	}
}
