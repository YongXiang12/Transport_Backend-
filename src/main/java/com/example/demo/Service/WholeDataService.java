package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.WholeDataRepository;
import com.example.demo.Entity.WholeData;

@Service
public class WholeDataService {

	@Autowired
	private WholeDataRepository repo ;
	
	
	
	public Iterable<WholeData> listAll(){
		return repo.findGpsLocation() ;
	}
	
	
	
}
