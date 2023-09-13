package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.User;

public interface HomeRepository extends JpaRepository<User, Integer> {

}
