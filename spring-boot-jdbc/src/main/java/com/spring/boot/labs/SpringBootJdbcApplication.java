package com.spring.boot.labs;

import com.spring.boot.labs.service.JournalService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(SpringBootJdbcApplication.class);

	@Autowired
	private JournalService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("@@ Inserting data...");
		service.insertData();

		log.info("@@ findAll() call...");
		service.findAll().forEach(entry ->  log.info(entry.toString()));
	}
}
