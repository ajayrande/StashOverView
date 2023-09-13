package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;
import com.cjc.service.HomeService;

@RestController
public class HomeController {
	
	
	@Autowired
	HomeService hs;
	
	@GetMapping("/getUser")
	public ResponseEntity<List<User>> getUser()
	{
		List<User> userList=hs.getAlluser();
		return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
	}
	

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User u)
	{
		User user=hs.saveUser(u);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}


	@GetMapping("/getsingleuser/{uid}")
public ResponseEntity<User> getsingleuser(@PathVariable("uid") int id) {
		
		User singleuser=hs.getsingleuser(id);
		
		
		return new ResponseEntity<User>(singleuser, HttpStatus.OK);
	}
	
@PutMapping("/updateUser")
public ResponseEntity<User> updateuser(@RequestBody User us){
	
	User user = hs.saveUser(us);
	
	return new ResponseEntity<User>(user, HttpStatus.OK);
	
}
	

}
