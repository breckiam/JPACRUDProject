package com.skilldistillery.travel.data;

import com.skilldistillery.travel.entities.Destination;

public interface TravelDAO {
	Destination findById(int id);
}
