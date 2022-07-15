package com.userloginregistration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.userloginregistration.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByName(String name);

	@Query(value= "select u.name from user11 u where u.name = :name",nativeQuery=true)
	String findUser(String name);
}
