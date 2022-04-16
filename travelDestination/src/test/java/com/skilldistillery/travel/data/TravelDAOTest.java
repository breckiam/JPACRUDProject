package com.skilldistillery.travel.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.travel.entities.Destination;

class TravelDAOTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private TravelDAO dao;
	private Destination dest; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	    emf = Persistence.createEntityManagerFactory("VideoStore");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	    emf.close();
	}
	
	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		dest = em.find(Destination.class, 1);
		dao = new TravelDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		dest = null;
		dao = null;
	}
	
	@Test
	void test_TravelDao_findByCityName_returns_correct_destination() {
		Destination d = dao.findByCityName("Brighton");
		assertNotNull(d);
		assertEquals(dest, d);
		
	}

	@Test
	void test_TravelDAO_createDestination_creates_destination() {
		Destination d = new Destination("United States", "Colorado", "Thornton");
		Destination newDest = dao.createDestination(d); 
		assertNotNull(newDest);
		assertEquals(d, newDest);
	}
	@Test
	void test_TravelDao_updateDestination_returns_updated_Destination() {
		Destination d = new Destination("United States", "Colorado", "Thornton");
		Destination updated = dao.updateDestination(1, d);
		assertNotNull(updated);
		assertEquals(d, updated);
	}
	
	@Test
	void test_TravelDao_deleteDestination_returns_true_when_succesful() {
		boolean testBool = dao.deleteDestination(1);
		assertEquals(true, testBool);
	}
	
	@Test
	void test_TravelDao_deleteDestination_returns_false_when_failed() {
		boolean testBool = dao.deleteDestination(100);
		assertEquals(false, testBool);
	}

}
