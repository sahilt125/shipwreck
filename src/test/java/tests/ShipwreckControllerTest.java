package tests;


import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;


public class ShipwreckControllerTest {

	@InjectMocks
    private ShipwreckController shipwreckController;
	
	@Test
	public void testList() {
		Assert.assertNotNull(shipwreckController.list());
	}

	@Test
	public void testCreate() {
		Shipwreck shipwreck = shipwreckController.create(new Shipwreck());
		Assert.assertNotNull(shipwreck);
	}

	@Test
	public void testGet() {
		Shipwreck shipwreck = shipwreckController.get(111L);
		Assert.assertNotNull(shipwreck);
	}

	@Test
	public void testUpdate() {
		Shipwreck shipwreck = shipwreckController.update(111L, new Shipwreck());
		Assert.assertNotNull(shipwreck);
	}

	@Test
	public void testDelete() {
		Shipwreck shipwreck = shipwreckController.delete(111L);
		Assert.assertNotNull(shipwreck);
	}

}
