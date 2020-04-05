package com.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.demo.model.UserRoleModel;

@Repository
public interface RoleRepository extends JpaRepository<UserRoleModel, Integer> {

}
