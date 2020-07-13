package com.providerdirectory.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public interface IProviderDirectory {

	@GetMapping(path = "/hi", produces = "application/json")
	public String greeting(); 
	
}
