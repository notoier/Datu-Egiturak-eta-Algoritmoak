package org.dea.laborategia1;
import java.util.ArrayList;
import java.util.Iterator;

public class Pelikula {

	//Atrib
	
	private String izenburua;
	private ListaAktoreak aktoreak;
	
	//Metodoak
	
	public Pelikula (String pIzenburua) {
		
		this.izenburua = pIzenburua;
		this.aktoreak = new ListaAktoreak();
		
	}
	
	public String getIzenburua() {
		
		return this.izenburua;
		
	}
	
	public boolean izenburuHoriDut (String pIzenburua) {
		
		return (this.izenburua == pIzenburua);
		
	}
	
	public ListaAktoreak nireAktoreakBueltatu() {
		
		return this.aktoreak;
		
	}
	
	
}
