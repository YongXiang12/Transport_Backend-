package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.RadarData;
import com.example.demo.Entity.UserInfo;
import com.example.demo.Repository.RadarRepository;


@Service
public class RadarService {

	
	@Autowired 
	private RadarRepository repo  ;	
	
	public Iterable<RadarData> get(double latitude ,  double longitude) {
		
		return repo.findByCoordinate(latitude , longitude);
	}
	

}
