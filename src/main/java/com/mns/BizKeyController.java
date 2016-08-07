package com.mns;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/key")
public class BizKeyController {

	@RequestMapping(value = "/all", method = RequestMethod.GET) 
	public String getAllBusinessKeys()
	{
		return "My first Return";
	}
	
	
}
