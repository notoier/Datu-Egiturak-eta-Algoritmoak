package org.dea.laborategia1;
import java.util.ArrayList;
import java.util.Iterator;


public class Aktorea {

	//Atributuak
	
	private String izena;
	private String abizena;
	private ListaPelikulak pelikulak;
	
	//Metodoak
	
	public Aktorea (String pIzena, String pAbizena) {
		
		this.izena = pIzena;
		this.abizena = pAbizena;
		this.pelikulak = new ListaPelikulak();
		
	}
	
	public String getIzena() {
		
		return this.izena;
		
	}
	
	public String getAbizena() {
		
		return this.abizena;
		
	}
	
	public String getIzenAbizena() {
		
		String izena = this.getIzena();
		String abizena = this.getAbizena();
		
		return abizena + izena;
		
	}

	public boolean izenHoriDut(String pIzena) {
		
		boolean emaitza = false;
		if(this.izena == pIzena) 
			{
				emaitza = true;
			}
		
		return emaitza;
		
	}

	public boolean abizenHoriDut(String pAbizena) {
		
			boolean emaitza = false;
			if(this.abizena == pAbizena) 
				{
				emaitza = true;
				}
		
			return emaitza;
		
	}
	
	public boolean aktoreHoriDa(String pIzena,String pAbizena) {
		
		return (izenHoriDut(pIzena) && abizenHoriDut(pAbizena));
		
	}
	
	public ListaPelikulak nirePelikulakBueltatu() {
		
		return this.pelikulak;
		
	}
	
	public void izenAbizenaInprimatu() {
		
		System.out.println(this.izena + " " + this.abizena);
		
	}
	
	
	
}
