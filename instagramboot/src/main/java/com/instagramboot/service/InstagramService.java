package com.instagramboot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.instagramboot.dao.InstagramDAOInterface;
import com.instagramboot.entity.InstagramUser;

import antlr.collections.List;
@Service
@Transactional  //is the replace of  1)entity transction et=session.get transactionsession .e
					//et.begin() then et.commit
@Scope(scopeName = "prototype")//one object for one request
public class InstagramService implements InstagramServiceInterface{
	
	@Autowired
	private InstagramDAOInterface idao;

	@Override
	public String createProfileService(InstagramUser iu) {
		idao.save(iu);
		
		return "profilecreated";
	}

	@Override
	public List getAllprofile() {
		
		return null;
	}

	@Override
	public List getAllprofileService() {
		
		return null ;
	}
	

}
