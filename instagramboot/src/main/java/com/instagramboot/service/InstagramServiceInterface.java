package com.instagramboot.service;

import com.instagramboot.entity.InstagramUser;

import antlr.collections.List;

public interface InstagramServiceInterface {

	String createProfileService(InstagramUser iu);

	List getAllprofile();

	List getAllprofileService();
	

}
