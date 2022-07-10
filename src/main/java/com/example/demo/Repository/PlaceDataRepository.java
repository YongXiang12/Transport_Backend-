package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.UserPlaceData;


public interface  PlaceDataRepository extends JpaRepository<UserPlaceData , Integer> {
	
	@Query(value="select * from user_store_placedata where Type = ?1", nativeQuery=true)
	public Iterable<UserPlaceData> findByName(Integer Type);
	
	
}
