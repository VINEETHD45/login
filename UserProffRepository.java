package com.userloginregistration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.userloginregistration.entity.ProffUser;
import com.userloginregistration.entity.User;


public interface UserProffRepository extends JpaRepository<ProffUser, Integer> {
	Optional<ProffUser> findUserByName(String name);

	
	@Query(value= "select u.name from proffuser u where u.name = :name",nativeQuery=true)
	String findUser(String name);
}