package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathalogy")
public class PathalogyResource {

	public PathalogyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("D1", "Desc1", "Treatment1"),
			new Disease("D2", "Desc2", "Treatment2"),
			new Disease("D3", "Desc3", "Treatment3")
			);
			
	
	@RequestMapping("/deseases")
	public DiseaseList diseases() {
		DiseaseList ds = new DiseaseList();
		ds.setDiseases(diseases);
		return ds;
	}
	
	@RequestMapping("/deseases/{id}")
	public Disease getDiseaseById(@PathVariable ("id") String id) {
		Disease d = diseases.stream().
				filter(disease -> id.equals(disease.getId()))
						.findAny()
						.orElse(null);
		return d;
	}
}
