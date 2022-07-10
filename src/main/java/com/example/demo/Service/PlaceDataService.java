package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.UserPlaceData;
import com.example.demo.Repository.PlaceDataRepository;


@Service 
public class PlaceDataService {
	
	@Autowired 
	private PlaceDataRepository repo  ;	
	
	
	public Iterable<UserPlaceData> listAll(){
		return repo.findAll();
	}
	
	public void save(UserPlaceData data) {
		repo.save(data);
	}
	
	public Iterable<UserPlaceData> get(Integer id) {
		
		return repo.findByName(id);
	}
	
	public void delete(Integer id ) {
		
		repo.deleteById(id);
	}
	
	
}
