package com.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.entities.AppUser;

import com.jpa.dao.UserRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		AppUser user = new AppUser();
		//id is autoimplemented....
		user.setName("harshita");
		user.setCity("indore");
		user.setStatus("java programmer");
		
		AppUser user1 = userRepository.save(user);
		System.out.println(user1);
	}
}