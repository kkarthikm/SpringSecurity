package com.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.demo.model.UserModel;

@Repository
public interface UserRepository  extends JpaRepository<UserModel, Integer>{

	UserModel findByName(String username);

}
