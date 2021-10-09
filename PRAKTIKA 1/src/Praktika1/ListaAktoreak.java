package org.dea.laborategia1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class ListaAktoreak {

	//Atributuak
	
	private  ArrayList<Aktorea> lista;
	
	//Metodoak
	
	public ListaAktoreak () {
		
		this.lista = new ArrayList<Aktorea>();
		
	}
	
	
	private Iterator<Aktorea> getIteradorea() {
		
		return this.lista.iterator();
	}
	
	
	public ArrayList<Aktorea> getLista(){
		
		return this.lista;
	}
	
	
	public Aktorea bilatuAktorea (String pIzena, String pAbizena) {
		
		Iterator<Aktorea> itr = this.getIteradorea();
		boolean aurkitua = false;
		Aktorea akt = null; 
		
		while (itr.hasNext() && !aurkitua) 
			{
				akt = itr.next();
				if (akt.aktoreHoriDa(pIzena, pAbizena))
				{
					aurkitua = true;
				}
			
			
			}
		if (!aurkitua) {
			
			akt = null;
		}
		
		return akt;
	}
	
	private boolean badagoAktorea(String pIzena, String pAbizena) {
		
		
		Iterator<Aktorea> itr = this.getIteradorea();
		boolean dago = false;
		Aktorea akt = null;
		
		while(itr.hasNext() && !dago){
			akt = itr.next();
			if(akt.aktoreHoriDa(pIzena, pAbizena)) {
				dago = true;
			}
		}
		
		return dago;
	}
	
	public void gehituAktorea (Aktorea pAktorea) {
		
		if (this.badagoAktorea(pAktorea.getIzena(), pAktorea.getAbizena()) == false) {
			
		
		this.lista.add(pAktorea);
		
		}
		
	}
	
	
	public void ezabatuAktorea (Aktorea pAktorea) {
		
		this.lista.remove(pAktorea);
		
	}
	
	
	public int aktoreKopurua() {
		
		return this.lista.size();
	}
	
	public void inprimatu() {
		
		Iterator<Aktorea> itr = this.getIteradorea();
		Aktorea akt = null;
		
		while (itr.hasNext()) {
			
			akt = itr.next();
			akt.izenAbizenaInprimatu();
			
		}
		
	}
	
	
	public void erreseteatu() {
		
		this.lista.clear();
	}
	

	public ArrayList<Aktorea> mergeSort(ArrayList<Aktorea> pZerrenOsoa) {
		
		
	    ArrayList<Aktorea> ezkerra = new ArrayList<Aktorea>();
	    ArrayList<Aktorea> eskuina = new ArrayList<Aktorea>();
	    int erdia;
	 
	    if (pZerrenOsoa.size() == 1) {    
	        return pZerrenOsoa;
	    } 
	    
	    else {
	    	
	        erdia = pZerrenOsoa.size()/2;
	        
	        // Kopiatu array osoaren ezkerreko erdiko zatia "ezkerra" aldagaian
	        
	        for (int i = 0; i < erdia; i++) {
	                ezkerra.add(pZerrenOsoa.get(i));
	        }
	 
	    
	       // Kopiatu array osoaren eskuineko erdiko zatia "eskuina" aldagaian
	        
	        for (int i = erdia; i < pZerrenOsoa.size(); i++) {
	                eskuina.add(pZerrenOsoa.get(i));
	        }
	 
	        
	        // Ordenatu ezkerreko eta eskuineko zatiak indibidualki
	        
	        ezkerra  = mergeSort(ezkerra);
	        eskuina = mergeSort(eskuina);
	 
	        // Emaitzak bateratu
	        
	        merge(ezkerra, eskuina, pZerrenOsoa);
	    }
	    
	    return pZerrenOsoa;
	}
	
	private void merge(ArrayList<Aktorea> pEzkerra, ArrayList<Aktorea> pEskuina, ArrayList<Aktorea> pZerrenOsoa) {
	    
		int ezkerrekoInd = 0;
	    int eskuinekoInd = 0;
	    int zerrendaOsokoInd = 0;
	 
	    // As long as neither the left or the right ArrayList has
	    // been used up, keep taking the smaller of left.get(leftIndex)
	    // or right.get(rightIndex) and adding it at both.get(bothIndex).
	    
	    while (ezkerrekoInd < pEzkerra.size() && eskuinekoInd < pEskuina.size()) {
	       
	    	if ( (pEzkerra.get(ezkerrekoInd).getIzenAbizena().compareTo(pEskuina.get(eskuinekoInd).getIzenAbizena())) < 0) {
	    		
	            pZerrenOsoa.set(zerrendaOsokoInd, pEzkerra.get(ezkerrekoInd));
	            ezkerrekoInd++;
	            
	        } 
	    	
	    	else {
	    		
	            pZerrenOsoa.set(zerrendaOsokoInd, pEskuina.get(eskuinekoInd));
	            eskuinekoInd++;
	        }
	        zerrendaOsokoInd++;
	    }
	 
	    
	}
}