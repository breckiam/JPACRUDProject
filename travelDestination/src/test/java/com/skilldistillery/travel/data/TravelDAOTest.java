package com.skilldistillery.travel.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.travel.entities.Destination;

class TravelDAOTest {
	private TravelDAO dao;
	

	@BeforeEach
	void setUp() throws Exception {
		dao = new TravelDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		dao = null;
	}
	
	@Test
	void test_TravelDao_findByCityName_returns_correct_destination() {
		Destination d = dao.findByCityName("Brighton");
		assertNotNull(d);
		assertEquals("Brighton", d.getCity());
		assertEquals("United States", d.getCountryName());
		assertEquals("Colorado", d.getStateRegion());
		
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
		Destination d = new Destination("United States", "Colorado", "Westminiter");
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
