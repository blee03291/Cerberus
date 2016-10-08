package com.bleehouse.model.factory;

import com.bleehouse.domain.entity.User;
import com.bleehouse.model.security.BleehouseUser;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

public class BleehouseUserFactory {

  public static BleehouseUser create(User user) {
    return new BleehouseUser(
      user.getId(),
      user.getUsername(),
      user.getPassword(),
      user.getEmail(),
      user.getLastPasswordReset(),
      AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities())
    );
  }

}
