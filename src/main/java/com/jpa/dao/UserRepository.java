package com.jpa.dao;
import com.jpa.entities.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Integer> {
	//CrudRepository has all the functionalities and springboot will provide implementation automatically

}