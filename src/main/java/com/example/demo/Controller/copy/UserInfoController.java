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

import com.example.demo.Entity.UserInfo;
import com.example.demo.Service.UserInfoService;

@RestController
public class UserInfoController {

	
	@Autowired
	private UserInfoService service ; 
	
	
	//get the all data
	@GetMapping("/User")
	public Iterable<UserInfo> list(){
		return service.listAll() ;
		
	}
	
	// get the data by id 
	@GetMapping("/User/{email}")
	public Iterable<UserInfo> get(@PathVariable String email){
		return service.get(email) ;
	}
	
	
	// add new file 
	@PostMapping("/User")
	public UserInfo  add(@RequestBody UserInfo data){
		service.save(data);
		return data ;
	}
	
	
	// update the file 
	@PutMapping("/User/{email}")
	public ResponseEntity<?> update(@RequestBody UserInfo data){
		
		try {
			service.save(data);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/PlaceData/{email}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
}
