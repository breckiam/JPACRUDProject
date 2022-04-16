package com.skilldistillery.travel.entities;

import java.time.LocalDate;

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
	
	@Column(name = "top_attractions")
	private String topAtrractions;
	
	@Column(name = "has_traveled")
	private boolean hasTraveled;
	
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

	public String getTopAtrractions() {
		return topAtrractions;
	}

	public void setTopAtrractions(String topAtrractions) {
		this.topAtrractions = topAtrractions;
	}

	public boolean isHasTraveled() {
		return hasTraveled;
	}

	public void setHasTraveled(boolean hasTraveled) {
		this.hasTraveled = hasTraveled;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	///////////// END SETTERS and GETTERS /////////////////////
	
	@Override
	public String toString() {
		return "Destination [id=" + id + ", countryName=" + countryName + ", stateRegion=" + stateRegion + ", city="
				+ city + ", topAtrractions=" + topAtrractions + ", hasTraveled=" + hasTraveled + ", arrivalDate="
				+ arrivalDate + ", departureDate=" + departureDate + "]";
	}

}
