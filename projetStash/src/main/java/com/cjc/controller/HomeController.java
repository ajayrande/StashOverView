package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;
import com.cjc.service.HomeService;

@RestController
public class HomeController {

@Autowired
HomeService hs;
	
	@GetMapping("/getall")
public ResponseEntity<List<User>> getall(@RequestBody User user) {
		List<User> userlist=hs.getAlluser();
		return new ResponseEntity<List<User>>(userlist, HttpStatus.OK);
	}
	
}
