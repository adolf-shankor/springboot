package com.instagramboot.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagramboot.entity.InstagramUser;
import com.instagramboot.service.InstagramServiceInterface;


@RestController
public class InstagramController {
	
	@Autowired//informing to spring to bean factory to create the object of bean service
	private InstagramServiceInterface instas;
	
	
	@PostMapping("createProfile")
	public String createProfile(@RequestBody InstagramUser iu) {
		return instas.createProfileService(iu);
		
	}
	//After taking data in request body we need to store in entity
	
	
	
	
	
	

}
