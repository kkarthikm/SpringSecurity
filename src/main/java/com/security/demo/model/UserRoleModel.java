package com.security.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="rolescurity")
@Entity
public class UserRoleModel {

	@Id
	@GeneratedValue
	private Integer roleId;
	private String roleType;
}
