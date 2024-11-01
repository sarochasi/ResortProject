package com.personalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.resort.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
