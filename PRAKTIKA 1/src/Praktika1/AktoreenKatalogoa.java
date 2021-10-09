package org.dea.laborategia1;

import java.util.Iterator;

public class AktoreenKatalogoa {

	//Atributuak
	
		private static AktoreenKatalogoa nireAktoreenKat = null;
		private ListaAktoreak lista;
		
		
		//Metodoak
		
		private AktoreenKatalogoa() {
			
			this.lista = new ListaAktoreak();
			
		}
		
		public static AktoreenKatalogoa getNireAktoreenKat() {
			
			if (AktoreenKatalogoa.nireAktoreenKat == null) 
			{
				AktoreenKatalogoa.nireAktoreenKat = new AktoreenKatalogoa();
			}
			
			return AktoreenKatalogoa.nireAktoreenKat;
		}
		
		public void gehituAktorea(Aktorea pAktorea) {
			
			this.lista.gehituAktorea(pAktorea);
			
		}
		
		public void ezabatuAktorea(Aktorea pAktorea) {
			
			this.lista.ezabatuAktorea(pAktorea);
			
		}
		
		public Aktorea bilatuAktorea (String pIzena, String pAbizena) {
			
			return this.lista.bilatuAktorea(pIzena, pAbizena);
			
		}
		
}



