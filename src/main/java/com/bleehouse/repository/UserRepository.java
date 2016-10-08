package com.bleehouse.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bleehouse.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUsername(String username);
  public ArrayList<User> findAll();
  @SuppressWarnings("unchecked")
  public User save(User user);
  public void delete(User user);
}
