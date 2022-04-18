package com.skilldistillery.travel.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    
public class Destination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "state_region")
	private String stateRegion;
	
	private String city;
	private Integer rating;
	
	@Column(name = "top_attractions")
	private String topAttractions;
	
	@Column(name = "has_traveled")
	private Integer hasTraveled;
	
	@Column(name = "arrival_date")
	private LocalDate arrivalDate;
	
	@Column(name = "departure_date")
	private LocalDate departureDate;
	
	

	public Destination() {
		super();
	}

	public Destination(String countryName, String stateRegion, String city) {
		super();
		this.countryName = countryName;
		this.stateRegion = stateRegion;
		this.city = city;
	}

	///////////// BEGIN SETTERS and GETTERS /////////////////////

	public int getId() {
		return id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

	public String getStateRegion() {
		return stateRegion;
	}

	public void setStateRegion(String stateRegion) {
		this.stateRegion = stateRegion;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTopAttractions() {
		return topAttractions;
	}

	public void setTopAttractions(String topAtrractions) {
		this.topAttractions = topAtrractions;
	}

	public Integer isHasTraveled() {
		return hasTraveled;
	}

	public void setHasTraveled(Integer hasTraveled) {
		this.hasTraveled = hasTraveled;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = LocalDate.parse(arrivalDate);
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = LocalDate.parse(departureDate);
	}

	///////////// END SETTERS and GETTERS /////////////////////
	
	@Override
	public String toString() {
		return "Destination [id=" + id + ", countryName=" + countryName + ", stateRegion=" + stateRegion + ", city="
				+ city + ", topAtrractions=" + topAttractions + ", hasTraveled=" + hasTraveled + ", arrivalDate="
				+ arrivalDate + ", departureDate=" + departureDate + "]";
	}

}
