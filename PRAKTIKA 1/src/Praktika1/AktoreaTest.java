package org.dea.laborategia1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AktoreaTest {

	@Test
	public void testAktorea() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIzena() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAbizena() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIzenAbizena() {
		
		Aktorea akt = new Aktorea ("Jon","Luengo");
		String izenAbizen = akt.getIzenAbizena();
		
		System.out.println(izenAbizen);
		assertNotNull(akt);
		
	}

	@Test
	public void testIzenHoriDut() {
		fail("Not yet implemented");
	}

	@Test
	public void testAbizenHoriDut() {
		fail("Not yet implemented");
	}

	@Test
	public void testAktoreHoriDa() {
		fail("Not yet implemented");
	}

	@Test
	public void testNirePelikulakBueltatu() {
		fail("Not yet implemented");
	}

}
