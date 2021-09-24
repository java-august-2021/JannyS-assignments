package com.example.HelloHuman.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String fname;
	
	@NotEmpty
	private String lname;
	
	@Email
	@NotBlank
	private String email;
	
	@Size(min=8)
	private String password;
	
	@Transient
	private String PasswordConfirmation;
	@Column(updatable=false)
	
	private Date createdAt;
	private Date updatedAt;
	
	public User() {
	}
	
	  @PrePersist
	    protected void onCreate() {
	        this.createdAt = new Date();
	}
	    @PostPersist
	    protected void onUpdate() {
	        this.updatedAt = new Date();
	}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPasswordConfirmation() {
			return PasswordConfirmation;
		}

		public void setPasswordConfirmation(String PasswordConfirmation) {
			this.PasswordConfirmation = PasswordConfirmation;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
}
