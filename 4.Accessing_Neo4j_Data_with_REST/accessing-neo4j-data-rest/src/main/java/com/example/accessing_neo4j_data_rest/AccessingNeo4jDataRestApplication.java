package com.example.accessing_neo4j_data_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
public class AccessingNeo4jDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingNeo4jDataRestApplication.class, args);
	}

}
