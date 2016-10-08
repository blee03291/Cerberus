package com.bleehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bleehouse.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUsername(String username);

}
