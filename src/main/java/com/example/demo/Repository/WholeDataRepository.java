package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.WholeData;

public interface WholeDataRepository extends JpaRepository<WholeData , Integer> {
	
	@Query(value="select id ,gps_longitude ,  gps_latitude from whole_year_data" ,nativeQuery=true)
	public Iterable<WholeData> findGpsLocation();
}
