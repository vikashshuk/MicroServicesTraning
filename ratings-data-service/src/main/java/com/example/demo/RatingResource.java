package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ratings;
import com.example.demo.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	public RatingResource() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/movies/{movieId}")
	public Ratings getMovieRating(@PathVariable("movieId") String movieId) {
		return new Ratings(movieId, 8);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		UserRating ur = new UserRating();
		ur.initData(userId);
		return ur;
	}

}
