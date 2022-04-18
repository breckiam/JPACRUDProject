package com.skilldistillery.travel.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.crypto.AEADBadTagException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DestinationTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Destination destination;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPATravel");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		destination = em.find(Destination.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		destination = null;
	}

	@Test
	void test_Destination_entity_mapping() {
		assertNotNull(destination);
		assertEquals("United States", destination.getCountryName());
		assertEquals("Colorado", destination.getStateRegion());
		assertEquals("Brighton", destination.getCity());
		assertEquals(3, destination.getRating());
		assertEquals(1, destination.getHasTraveled());
		assertNull(destination.getTopAttractions(), "null");
		assertNull(destination.getArrivalDate(), "null");
		assertNull(destination.getDepartureDate(), "null");
	}

}
