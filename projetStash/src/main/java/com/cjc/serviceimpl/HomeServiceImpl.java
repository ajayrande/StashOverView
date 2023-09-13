package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.model.User;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeRepository hr;

	@Override
	public List<User> getAlluser() {
		
		return hr.findAll();
	}

}
