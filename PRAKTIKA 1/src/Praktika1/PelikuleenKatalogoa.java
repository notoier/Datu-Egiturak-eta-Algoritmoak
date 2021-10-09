package org.dea.laborategia1;

public class PelikuleenKatalogoa {

	//Atributuak
	
	private static PelikuleenKatalogoa nirePelikulaKat = null;
	private ListaPelikulak lista;
	
	
	//Metodoak
	
	private PelikuleenKatalogoa() {
		
		this.lista = new ListaPelikulak();
		
	}
	
	public static PelikuleenKatalogoa getNirePelikulaKat() {
		
		if (PelikuleenKatalogoa.nirePelikulaKat == null) 
		{
			PelikuleenKatalogoa.nirePelikulaKat = new PelikuleenKatalogoa();
		}
		
		return PelikuleenKatalogoa.nirePelikulaKat;
	}
	
	public void gehituPelikula(Pelikula pPelikula) {
		
		this.lista.gehituPelikula(pPelikula);
		
	}
	
	public void ezabatuPelikula(Pelikula pPelikula) {
		
		this.lista.ezabatuPelikula(pPelikula);
		
	}
	
}
