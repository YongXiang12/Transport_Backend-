package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.RadarData;


public interface RadarRepository extends JpaRepository<RadarData , Integer> {

	@Query(value="select * from test where (latitude <= ?1 + 0.0005 and latitude >= ?1 - 0.0005) and (longitude <= ?2 + 0.0005 and longitude >= ?2 - 0.0005)", nativeQuery=true)
	public Iterable<RadarData> findByCoordinate(double latitude , double longitude);
	
}
