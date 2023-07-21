package com.example.demo.models;

public class Movie {

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieId2, String name, String description) {
		super();
		this.movieId = movieId2;
		this.name = name;
		this.description= description;
	}
	
	private String movieId;
	private String name;
	private String description;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
