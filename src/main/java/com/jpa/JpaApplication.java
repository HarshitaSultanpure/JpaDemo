package com.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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


		
//SAVE OPERATION..................................................		
		//id is autoimplemented....

		//create object 
//		AppUser user1 = new AppUser();
//		user1.setName("uttam");
//		user1.setCity("pune");
//		user1.setStatus("java programmer ");
//		
		//will save a single entity/user..
//		AppUser u1 = userRepository.save(user1);  
//		System.out.println(u1);
//	
//		AppUser user2 = new AppUser();
//		user2.setName("ankita");
//		user2.setCity("pune");
//		user2.setStatus("ML programmer ");
//		
//		
//		AppUser user3 = new AppUser();
//		user3.setName("khushi");
//		user3.setCity("banglore");
//		user3.setStatus("python programmer ");
		
		//to create list (from java 1.9 provided List.of to save multiple entities )
//		List<AppUser> users = List.of(user2, user3);
		
		//will save multiple objects/users in one go..
//		Iterable<AppUser> result = userRepository.saveAll(users);
		
		//to traverse result 
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		
		
		
		
//UPDATE OPERATION........................................
		
		//get data (findById(id) => returns Optional containing the data)
//		Optional<AppUser> updatedUser1 = userRepository.findById(152);
//		
//		AppUser user1 = updatedUser1.get();
		
		//updating uttam
//		user1.setStatus("c# programmer");
//		AppUser u1 = userRepository.save(user1);
//		System.out.println(u1);
		
		
		
		

//GET DATA/Retrieve entities
		//to find single user data : findById(id) => returns Optional containing the data
		//to find all users data : findAll() => returns Iterable containing all the data

		Iterable<AppUser> allUsers = userRepository.findAll();
		
		//to iterate all users old way
//		Iterator<AppUser> it = allUsers.iterator();
//		while(it.hasNext())
//		{
//			AppUser user = it.next();
//			System.out.println(user);	
//		}
		
		//new way to iterate all from(1.8) in this we either pass lambda or consumer 
		allUsers.forEach(new Consumer<AppUser>() {

			//it is a implimentation anonymous class of Consumer
			@Override
			public void accept(AppUser t) {
				System.out.println(t);
			}
		});
		
		
		
		
		
		
//DELETE OPERATION		
		//userRepository.deleteById(52);
		//System.out.println("deleted user");
		
		//will delete all entities
		//userRepository.deleteAll();
		
		
		
	}
}