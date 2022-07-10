package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserInfo;
import com.example.demo.Repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	@Autowired 
	private UserInfoRepository repo  ;	
	
	
	public Iterable<UserInfo> listAll(){
		return repo.findAll();
	}
	
	public void save(UserInfo data) {
		repo.save(data);
	}
	
	public Iterable<UserInfo> get(String email) {
		
		return repo.findByEmail(email);
	}
	
	public void delete(Integer id ) {
		
		repo.deleteById(id);
	}
}
