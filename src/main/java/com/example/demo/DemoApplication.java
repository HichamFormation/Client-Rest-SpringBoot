package com.example.demo;

import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		RestTemplate       restTemplate=new RestTemplate();
		
		HttpHeaders        headers=new HttpHeaders();
		 
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		String             ressourceURL="http://localhost:8082/contacts";
		
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		
		ResponseEntity<AdressLabel[]> response=restTemplate.exchange(ressourceURL, HttpMethod.GET, entity, AdressLabel[].class);
		if(response.getStatusCode()==HttpStatus.OK) { 
        
			for(AdressLabel adressLabel : response.getBody()) {
				System.out.println(adressLabel.email);
			}
			
		} else 
		{
			System.out.println("Error");
		}
	}

}
