package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.User;
@Repository
public interface HomeRepository extends JpaRepository<User, Integer> {

	User findByUid(int id);

}
