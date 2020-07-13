package com.providerdirectory.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.providerdirectory.resource.IProviderDirectory;
import com.providerdirectory.service.IProviderDirectoryService;

@RestController
public class ProviderDirectoryImpl implements IProviderDirectory{

	
	@Autowired
	IProviderDirectoryService providerDirectoryService;
	
	public String greeting(){
		return providerDirectoryService.greeting();
	}
}
