package com.revature.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pm.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
