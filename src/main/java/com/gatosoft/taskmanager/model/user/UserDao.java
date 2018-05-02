package com.gatosoft.taskmanager.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	  /**
	   * This method will find an User instance in the database by its email.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
	  public User findByEmail(String email);
	  
	  /**
	   * Find an User instance in the database filtering by his unique id.
	   * @param id
	   * @return
	   */
	  public User findById(long id); 
	
}
