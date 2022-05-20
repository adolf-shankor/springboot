package com.instagramboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagramboot.entity.InstagramUser;

//only interface no class of dao
//for hibernate

@Repository
public interface InstagramDAOInterface extends JpaRepository<InstagramUser, String>{
	

}
