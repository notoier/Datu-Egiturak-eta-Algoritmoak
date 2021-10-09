package org.dea.laborategia1;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPelikulak {

	//Atributuak
	
	private ArrayList<Pelikula> lista;
	
	//Metodoak
	
	public ListaPelikulak () {
		
		this.lista = new ArrayList<Pelikula>();
		
	}
	
	private Iterator<Pelikula> getIteradorea() {
		
		return this.lista.iterator();
	}
	

	public boolean badagoPelikula (String pIzenburua) {
		
		Iterator<Pelikula> itr = this.getIteradorea();
		boolean dago = false;
		Pelikula pel = null;
		
		while(itr.hasNext() && !dago){
			pel = itr.next();
			if(pel.izenburuHoriDut(pIzenburua)) {
				dago = true;
			}
		}
		
		return dago;
		
	}
	
	
	public void gehituPelikula (Pelikula pPelikula) {
		
		if (this.badagoPelikula(pPelikula.getIzenburua()) == false) {
			
		this.lista.add(pPelikula);
		
		}
		
	}
	
	public void ezabatuPelikula (Pelikula pPelikula) {
		
		this.lista.remove(pPelikula);
	
	
	}
	
	public int pelikulaKopurua() {
		
		return this.lista.size();
	}
	
	
	public void erreseteatu() {
		
		this.lista.clear();
	}




}
