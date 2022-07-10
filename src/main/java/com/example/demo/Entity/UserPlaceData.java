package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user_store_placedata")

public class UserPlaceData {

	@Id
	private Integer id ; 
	@Column(name = "placename")
	private String PlaceName ;
	@Column(name = "address")
	private String Address ;
	@Column(name = "type")
	private Integer Type ;
	
	UserPlaceData(){
		
	}
	
	UserPlaceData(Integer id , String PlaceName , String Address , Integer Type){
		
		this.id = id ;
		this.PlaceName = PlaceName ;
		this.Address = Address ;
		this.Type = Type ; 
	}
	
	UserPlaceData(String PlaceName , String Address , Integer Type){
		
		
		this.PlaceName = PlaceName ;
		this.Address = Address ;
		this.Type = Type ; 
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlaceName() {
		return PlaceName;
	}
	public void setPlaceName(String placeName) {
		PlaceName = placeName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getType() {
		return Type;
	}
	public void setType(Integer type) {
		Type = type;
	}
	
	
	
}
