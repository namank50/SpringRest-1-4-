package com.example.sixth.ConsuptionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceConsuption {
	
	private RestTemplate restTemplate;

	@Autowired
	public ServiceConsuption(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public Integer add(Integer n1,Integer n2)
	{

		HttpEntity<Integer> entity =new HttpEntity<Integer>(n1); 
		
	}
	

}
