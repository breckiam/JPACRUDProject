package com.skilldistillery.travel.data;


import java.util.List;

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
		String query = "SELECT d FROM Destination d WHERE d.city LIKE :city";
		return em.createQuery(query, Destination.class)
				.setParameter("city", "%" + city + "%").getSingleResult();
	}

	@Override
	public Destination createDestination(Destination dest) {
		if (dest.getCity() != null && dest.getCountryName() != null
				&& dest.getStateRegion() != null) {
			em.persist(dest);
			em.flush();
		} else {
			dest = null;
		}
		return dest;
	}

	@Override
	public Destination updateDestination(int id, Destination dest) {
		Destination updateDest = em.find(Destination.class, id);
		updateDest.setCountryName(dest.getCountryName());
		updateDest.setStateRegion(dest.getStateRegion());
		updateDest.setCity(dest.getCity());
		updateDest.setRating(dest.getRating());
		updateDest.setTopAttractions(dest.getTopAttractions());
		updateDest.setHasTraveled(dest.getHasTraveled());
		updateDest.setArrivalDate(dest.getArrivalDate().toString());
		updateDest.setDepartureDate(dest.getDepartureDate().toString());
		
		return updateDest;
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
	
	@Override
	public List<Destination> showAll() {
		String query = "SELECT d FROM Destination d";
		List<Destination> dl = em.createQuery(query, Destination.class)
				.getResultList();
		
		return dl;
	}

}
