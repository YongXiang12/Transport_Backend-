package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="whole_year_data")


public class WholeData {

	
	@Id
	private Integer id ; 
	@Column(name = "gps_longitude")
	private Double gps_longitude ;
	@Column(name = "gps_latitude" )
	private Double gps_latitude ;
	
	public WholeData() {
		
	}
	
	
	public WholeData( Double gps_longitude, Double gps_latitude) {
		this.gps_longitude = gps_longitude;
		this.gps_latitude = gps_latitude;
	}
	
	
	public WholeData(Integer id, Double gps_longitude, Double gps_latitude) {
		this.id = id;
		this.gps_longitude = gps_longitude;
		this.gps_latitude = gps_latitude;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getGps_longitude() {
		return gps_longitude;
	}
	public void setGps_longitude(Double gps_longitude) {
		this.gps_longitude = gps_longitude;
	}
	public Double getGps_latitude() {
		return gps_latitude;
	}
	public void setGps_latitude(Double gps_latitude) {
		this.gps_latitude = gps_latitude;
	}
}
