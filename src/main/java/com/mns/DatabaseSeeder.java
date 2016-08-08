package com.mns;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner{

	private BizKeyRepository bizKeyRepository;
	
	@Autowired
	public DatabaseSeeder(BizKeyRepository BizKeyRepository) {
		this.bizKeyRepository=BizKeyRepository;
	}
	
	
	
	@Override
	public void run(String... args) throws Exception {
		List<Bizkey> bizkeyList = new ArrayList<Bizkey>();
		bizkeyList.add(new Bizkey(1, "ATP_KILL_SWITCH", "1", "mns", 0, "R30"));
		bizkeyList.add(new Bizkey(2, "Reserve_KILL_SWITCH", "1", "cftouk", 0, "R31"));
		bizkeyList.add(new Bizkey(3, "Order_KILL_SWITCH", "1", "cftoie", 1, "R31"));
		bizKeyRepository.save(bizkeyList);
	}
}
