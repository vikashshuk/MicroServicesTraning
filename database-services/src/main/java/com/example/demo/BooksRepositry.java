package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface BooksRepositry extends CrudRepository<Books, Long>{
  List<Books> findByName(String name);
  
  @Query("select u from Books u where u.name = :name")
  List<Books> findByName1(String name);
}
