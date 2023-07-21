package com.example.demo.resource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.CatalogItem;
import com.example.demo.models.Movie;
import com.example.demo.models.UserRating;
import com.example.demo.service.MovieInfo;
import com.example.demo.service.UserRatingInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	public CatalogResource() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	@RequestMapping("/{userId}")
	//@HystrixCommand(fallbackMethod = "getFallBackCatalog")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
//		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/"+userId, UserRating.class);
//		return userRating.getRatingList().stream().map(rating -> {
//			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
//			return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating());
//		}).collect(Collectors.toList());
		
		UserRating userRating = userRatingInfo.getUserRating(userId);
		return userRating.getRatingList().stream()
				.map(rating -> movieInfo.getCatlogItem(rating))
				.collect(Collectors.toList());
	}
	
//	public List<CatalogItem> getFallBackCatalog(@PathVariable("userId") String userId){
//		return Arrays.asList(new CatalogItem("No movie available right now", "",0));
//		
//	}
}
