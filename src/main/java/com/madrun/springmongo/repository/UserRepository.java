package com.madrun.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.madrun.springmongo.model.Follower;
import com.madrun.springmongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {

	@Query("{'interest':?0}")
	List<User> findByInterest(String interest);
	

}
