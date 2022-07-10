package com.example.demo.Controller.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.WholeData;
import com.example.demo.Service.WholeDataService;

@RestController
public class WholeDataController {
	
	@Autowired
	private WholeDataService service ; 
	
	
	@GetMapping("/WholeData/Location")
	public Iterable<WholeData> list(){
		return service.listAll();
	}
	
	
	
}
