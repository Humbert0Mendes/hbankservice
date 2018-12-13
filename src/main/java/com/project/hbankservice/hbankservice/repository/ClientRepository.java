package com.project.hbankservice.hbankservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.project.hbankservice.hbankservice.entity.Client;

public interface ClientRepository extends MongoRepository<Client, Long> {
	
	@Query("{ 'name' : ?0 }")
	Client findByNameQualquerCoisa(String name);
	
	@Query("{'id' : ?0 }")
	Client findByIdClient(String id);
}
