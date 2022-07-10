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

import com.example.demo.Entity.UserPlaceData;
import com.example.demo.Service.PlaceDataService;

@RestController
public class PlaceDataController {

		@Autowired
		private PlaceDataService service ; 
		
		
		//get the all data
		@GetMapping("/PlaceData/")
		public Iterable<UserPlaceData> list(){
			return service.listAll() ;
			
		}
		
		// get the data by id 
		@GetMapping("/PlaceData/{Type}")
		public Iterable<UserPlaceData> get(@PathVariable Integer Type){
			return service.get(Type) ;
		}
		
		
		// add new file 
		@PostMapping("/PlaceData")
		public UserPlaceData  add(@RequestBody UserPlaceData data){
			service.save(data);
			return data ;
		}
		
		
		// update the file 
		@PutMapping("/PlaceData/{id}")
		public ResponseEntity<?> update(@RequestBody UserPlaceData data){
			
			try {
				service.save(data);
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
		}
		
		@DeleteMapping("/PlaceData/delete/{id}")
		public void delete(@PathVariable Integer id) {
			service.delete(id);
		}
		
		
		
		
}
