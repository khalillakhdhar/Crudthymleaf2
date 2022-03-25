package com.th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.th.model.Formation;
import com.th.repository.FormationRepository;

@SpringBootApplication
public class Crudthymleaf2Application implements CommandLineRunner{
@Autowired
FormationRepository formationRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Crudthymleaf2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Formation f=new Formation();
//		f.setPrix(2000);
//		f.setTitre("java");
//		Formation f2=new Formation();
//		f2.setPrix(2000);
//		f2.setTitre("java web");
//		formationRepository.save(f);
//		
		
	}

}
