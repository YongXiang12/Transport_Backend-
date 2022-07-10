package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	@Query(value="select * from user_signup_info where email = ?1", nativeQuery=true)
	public Iterable<UserInfo> findByEmail(String email);
	
}
