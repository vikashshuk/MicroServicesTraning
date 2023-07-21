package com.example.demo.models;

public class Ratings {

	public Ratings() {
		// TODO Auto-generated constructor stub
	}
	
	private String movieId;
	private Integer rating;
	
	public Ratings(String movieId, Integer rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
}
