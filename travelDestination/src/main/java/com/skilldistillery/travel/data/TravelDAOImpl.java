package com.skilldistillery.travel.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.travel.entities.Destination;

@Service
@Transactional
public class TravelDAOImpl implements TravelDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Destination findById(int id) {
		return em.find(Destination.class, id);
	}

}
