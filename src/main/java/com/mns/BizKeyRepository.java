package com.mns;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BizKeyRepository extends JpaRepository<Bizkey, Long> {
	
	List<Bizkey> findBybizKeyRelease(String bizKeyRelease);
	
	List<Bizkey> findBybizKeyType(int bizKeyType);
	
	//List<Bizkey> findBybizKeyTypeAndbizKeyRelease(int bizKeyType, String bizKeyRelease);
	

}
