package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Car;



public interface CarMongoRepository extends CrudRepository<Car, String> {

}
