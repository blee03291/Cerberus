package com.bleehouse.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bleehouse.domain.base.DomainBase;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "users")
public class User extends DomainBase {

  private Long id;
  private String username;
  private String password;
  private String email;
  private Date lastPasswordReset;
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

  @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
	@SequenceGenerator(name = "users_seq", sequenceName = "users_seq", allocationSize = 1)
  public Long getId() {
    return this.id;
  }

  @Column(name = "username")
  public String getUsername() {
    return this.username;
  }


  @Column(name = "password")
  public String getPassword() {
    return this.password;
  }


  @Column(name = "email")
  public String getEmail() {
    return this.email;
  }

  @Column(name = "last_password_reset")
  public Date getLastPasswordReset() {
    return this.lastPasswordReset;
  }

  
  @Column(name = "authorities")
  public String getAuthorities() {
    return this.authorities;
  }



}
