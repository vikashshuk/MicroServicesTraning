package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseServicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServicesApplication.class, args);
	}
    
	private static final Logger log = LoggerFactory.getLogger(DatabaseServicesApplication.class);
			
	@Autowired
	private BooksRepositry bookRepositry;
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Starting the Db Server");
		// TODO Auto-generated method stub
		bookRepositry.save(new Books("Book 1"));
		bookRepositry.save(new Books("Book 2"));
		bookRepositry.save(new Books("Book 3"));
		bookRepositry.save(new Books("Book 4"));
		bookRepositry.save(new Books("Book 5"));
		
		System.out.println("\n find all records");
		
		bookRepositry.findAll().forEach(x -> System.out.println(x));
		
		System.out.println("\n find by ID");
		
		bookRepositry.findById((long) 3).ifPresent(x -> System.out.println(x));
		
		System.out.println("\n find by name");
		
		bookRepositry.findByName("Book 3").forEach(x -> System.out.println(x));
		
		System.out.println("\n find by name1");
		
		bookRepositry.findByName1("Book 3").forEach(x -> System.out.println(x));
		
		System.out.println("\n Delete Book by Id 3");
		
		Books booktoDelete = bookRepositry.findById(3L).get();
		bookRepositry.delete(booktoDelete);
		
		System.out.println("\n Delete Book by Id 2");
		bookRepositry.deleteById(2L);
		
		System.out.println("\n Delete All Book by Name");
		bookRepositry.deleteAll(bookRepositry.findByName("Book 1"));
	}

}
