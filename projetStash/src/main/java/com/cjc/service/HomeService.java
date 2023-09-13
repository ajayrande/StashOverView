package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.model.User;
import com.cjc.repository.HomeRepository;
@Service
public interface HomeService {

	


public List<User> getAlluser();


public User saveUser(User u);

public User getsingleuser(int id);





public void Deletedata(int id);


	
}
