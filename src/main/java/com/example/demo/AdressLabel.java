package com.example.demo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;



public class AdressLabel {
	
	@JsonProperty("id")
	public Long   id;
	@JsonProperty("nom")
	public String nom;
	@JsonProperty("prenom")
	public String prenom;
	@JsonProperty("dateNaissance")
	public Date   dateNaissance;
	@JsonProperty("email")
	public String email;
	@JsonProperty("tel")
	public long   tel;
	@JsonProperty("photo")
	public String photo;
	
	
	
}
