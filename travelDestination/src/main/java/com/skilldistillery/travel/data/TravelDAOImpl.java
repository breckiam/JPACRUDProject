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

	@Override
	public Destination findByCityName(String city) {
		String query = "SELECT d FROM Destination WHERE d.city = :city";
		return em.createQuery(query, Destination.class)
				.setParameter("city", city).getSingleResult();
	}

	@Override
	public Destination createDestination(Destination dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Destination updateDestination(int id, Destination dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDestination(int id) {
		boolean wasDeleted = false;
		Destination d  = em.find(Destination.class, id);
		if (d != null) {
			em.remove(d);
			em.flush();
			wasDeleted = !em.contains(d);
		}
		return wasDeleted;
	}

}
