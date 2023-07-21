package com.example.demo.models;

import java.util.Arrays;
import java.util.List;

public class UserRating {

	public UserRating() {
		// TODO Auto-generated constructor stub
	}
	
	private String userId;
	private List<Ratings> ratingList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Ratings> getRatingList() {
		return ratingList;
	}
	public void setRatingList(List<Ratings> ratingList) {
		this.ratingList = ratingList;
	}
	
	public void initData(String userId) {
		this.setUserId(userId);
		this.setRatingList(Arrays.asList(
				new Ratings("100",3),
				new Ratings("200",4)));
	}
}
