package com.example.demo.Controller.copy;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.RadarData;
import com.example.demo.Entity.UserPlaceData;
import com.example.demo.Service.RadarService;


@RestController
public class RadarSearchController {

	@Autowired
	private RadarService service ; 
	
	
	// get the data by location[
	@GetMapping("/Radar/{latitude}/{longitude}")
	public Iterable<RadarData> get(@PathVariable double latitude , @PathVariable double longitude){
		
		
		return service.get(latitude , longitude) ;
	}
	
	
	
	
	
}
