package com.jpa.dao;
import com.jpa.entities.AppUser;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<AppUser, Integer> {
	//CrudRepository has all the functionalities and springboot will provide implementation automatically

	//custom finder methods : 
	public List<AppUser> findByName(String name); //find is called as introducer, ByName is our criteria 

	public List<AppUser> findByNameAndCity(String name, String city);

	//JPQL queries : Java Persistence Query Language
	@Query("select u from AppUser u") // last u is alias of AppUser and will provide u as object
	public List<AppUser> getAllUser();

	@Query("select u from AppUser u where u.name = :n and u.city = :c")
	public List<AppUser> getUserByName(@Param("n") String name,@Param("c") String city); //in Param annotation we bind our variable whatever name we will pass will be stored in 'n'

	//Native queries
	@Query(value = "select * from AppUser", nativeQuery = true) //it will understand that the query is sql query.
	public List<AppUser> getUsers();
	
}