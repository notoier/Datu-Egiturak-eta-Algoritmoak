package org.dea.laborategia1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaAktoreakTest {

	
	ListaAktoreak la1;
	Aktorea akt1,akt2,akt3,akt4,akt5,akt6;
	
	
	@Test
	public void testListaAktoreak() {
		
		assertNull(la1);
		la1 = new ListaAktoreak();
		assertNotNull(la1);
		
		la1 = null;
	}

	@Test
	public void testBilatuAktorea() {
		
		la1 = new ListaAktoreak();
		akt1 = new Aktorea("Jone", "Aranda");
		akt2 = new Aktorea("Aitor", "Bermejo");
		akt3 = new Aktorea("Oihane", "Cortijo");
		la1.gehituAktorea(akt1);
		la1.gehituAktorea(akt2);
		la1.gehituAktorea(akt3);
		
		Aktorea aktBilatua = la1.bilatuAktorea("Aitor", "Bermejo");
		assertEquals(aktBilatua,akt2);
		
		aktBilatua = la1.bilatuAktorea("Oihane", "Cortijo");
		assertEquals(aktBilatua,akt3);
		
		aktBilatua = la1.bilatuAktorea("Raul", "Duval");
		assertNull(aktBilatua);
		
		
		la1 = null;
		akt1 = null;
		akt2 = null;
		akt3 = null;
	}

	@Test
	public void testGehituAktorea() {
		
		la1 = new ListaAktoreak();
		assertTrue(la1.aktoreKopurua() == 0);
		
		akt1 = new Aktorea("Jone", "Aranda");
		la1.gehituAktorea(akt1);
		assertTrue(la1.aktoreKopurua() == 1);
		
		akt2 = new Aktorea("Aitor", "Bermejo");
		la1.gehituAktorea(akt2);
		assertTrue(la1.aktoreKopurua() == 2);
		
		la1.gehituAktorea(akt2);
		assertTrue(la1.aktoreKopurua() == 2);
		
		la1 = null;
		akt1 = null;
		akt2 = null;
		
	}

	@Test
	public void testEzabatuAktorea() {
		
		la1 = new ListaAktoreak();
		akt1 = new Aktorea("Jone", "Aranda");
		akt2 = new Aktorea("Aitor", "Bermejo");
		akt3 = new Aktorea("Oihane", "Cortijo");
		
		la1.gehituAktorea(akt1);
		la1.gehituAktorea(akt2);
		assertTrue(la1.aktoreKopurua() == 2);
		
		la1.ezabatuAktorea(akt1);
		assertTrue(la1.aktoreKopurua() == 1);

		la1.ezabatuAktorea(akt3);
		assertTrue(la1.aktoreKopurua() == 1);
		
		la1.ezabatuAktorea(akt2);
		assertTrue(la1.aktoreKopurua() == 0);
		
		akt1 = null;
		akt2 = null;
		akt3 = null;
		la1 = null;
	}

	@Test
	public void testAktoreKopurua() {
		
		//Aurreko 2 probetan funtzionamendu egokia duela bermatzen da
		
	}

	@Test
	public void testErreseteatu() {
		
		la1 = new ListaAktoreak();
		akt1 = new Aktorea("Jone", "Aranda");
		akt2 = new Aktorea("Aitor", "Bermejo");
		akt3 = new Aktorea("Oihane", "Cortijo");
		
		la1.gehituAktorea(akt1);
		la1.gehituAktorea(akt2);
		la1.gehituAktorea(akt3);
		
		assertTrue(la1.aktoreKopurua() == 3);
		
		la1.erreseteatu();
		
		assertTrue(la1.aktoreKopurua() == 0);
		
	}

	@Test
	public void testMergeSort() {
		
		la1 = new ListaAktoreak();
		
		assertNotNull(la1);
		
		akt1 = new Aktorea("Jone", "Abadia");
		akt2 = new Aktorea("Aitor", "Bermejo");
		akt3 = new Aktorea("Oihane", "Cortijo");
		akt4 = new Aktorea("Nerea", "Abarrategi");
		akt6 = new Aktorea("Eneko", "Zaramillo");
		
		la1.gehituAktorea(akt1);
		la1.gehituAktorea(akt2);
		la1.gehituAktorea(akt3);
		la1.gehituAktorea(akt4);
		la1.gehituAktorea(akt6);
	
		
		la1.inprimatu();
		
		la1.mergeSort(la1.getLista());
		
		System.out.println("------------------------");
		
		la1.inprimatu();
		
		
		
	}

}
