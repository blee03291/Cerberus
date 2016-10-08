package com.bleehouse.model.security;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
@Data
public class BleehouseUser implements UserDetails {

  private Long id;
  private String username;
  @JsonIgnore
  private String password;
  private String email;
  @JsonIgnore
  private Date lastPasswordReset;
  private Collection<? extends GrantedAuthority> authorities;
  @JsonIgnore
  private Boolean accountNonExpired = true;
  private Boolean accountNonLocked = true;
  @JsonIgnore
  private Boolean credentialsNonExpired = true;
  @JsonIgnore
  private Boolean enabled = true;

  public BleehouseUser() {
    super();
  }

  public BleehouseUser(Long id, String username, String password, String email, Date lastPasswordReset, Collection<? extends GrantedAuthority> authorities) {
    this.setId(id);
    this.setUsername(username);
    this.setPassword(password);
    this.setEmail(email);
    this.setLastPasswordReset(lastPasswordReset);
    this.setAuthorities(authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.authorities;
  }

  @JsonIgnore
  public Boolean getAccountNonExpired() {
    return this.accountNonExpired;
  }


  @Override
  public boolean isAccountNonExpired() {
    return this.getAccountNonExpired();
  }

  @Override
  public boolean isAccountNonLocked() {
    return this.getAccountNonLocked();
  }


  @Override
  public boolean isCredentialsNonExpired() {
    return this.getCredentialsNonExpired();
  }

  @Override
  public boolean isEnabled() {
    return this.getEnabled();
  }

}
