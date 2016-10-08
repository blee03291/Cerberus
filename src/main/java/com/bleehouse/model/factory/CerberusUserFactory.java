package com.bleehouse.model.factory;

import com.bleehouse.domain.entity.User;
import com.bleehouse.model.security.CerberusUser;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

public class CerberusUserFactory {

  public static CerberusUser create(User user) {
    return new CerberusUser(
      user.getId(),
      user.getUsername(),
      user.getPassword(),
      user.getEmail(),
      user.getLastPasswordReset(),
      AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities())
    );
  }

}
