package com.skilldistillery.travel.data;

import com.skilldistillery.travel.entities.Destination;

public interface TravelDAO {
	Destination findById(int id);
	Destination findByCityName(String city);
	Destination createDestination(Destination dest);
	Destination updateDestination(int id, Destination dest);
	boolean deleteDestination(int id);
}
