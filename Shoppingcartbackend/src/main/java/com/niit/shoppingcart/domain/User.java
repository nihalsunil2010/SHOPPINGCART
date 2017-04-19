package com.niit.shoppingcart.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
@Entity
@Component

public class User {
	@Id
	private String id;
	
	@NotEmpty(message="This field is required")
	@Column(name="name")
    private String name;
	

	
	@Column(name="password")
	private String password;
	
	
	@Column(name="mail",unique=true,nullable=false)
	private String mail;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="role")
	private String role;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
