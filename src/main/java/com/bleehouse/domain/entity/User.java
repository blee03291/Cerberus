package com.bleehouse.domain.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "users")
public class User {
	
  @Id
	@Column(name = "id")
  	@GeneratedValue(strategy = GenerationType.IDENTITY)
  	@SequenceGenerator(name = "users_seq", sequenceName = "users_seq", allocationSize = 1, initialValue = 100)
  	@Basic(optional = false)  
  private Long id;
  
  @Column(name = "username")
  private String username;
  
  @Column(name = "password")
  private String password;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "last_password_reset")
  private Date lastPasswordReset;
  
  @Column(name = "authorities")
  private String authorities;

  public User() {
    super();
  }

  public User(String username, String password, String email, Date lastPasswordReset, String authorities) {
    this.setUsername(username);
    this.setPassword(password);
    this.setEmail(email);
    this.setLastPasswordReset(lastPasswordReset);
    this.setAuthorities(authorities);
  }

}
