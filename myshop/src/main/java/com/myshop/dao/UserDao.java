package com.myshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.entities.Users;

@Repository
public interface UserDao extends  JpaRepository<Users, Integer>{

    Users findByUsername(String username);
    

}
