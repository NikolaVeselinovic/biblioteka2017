package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	private LinkedList<Knjiga> knjige= new LinkedList<Knjiga>();
	
	
	public void dodajKnjigu(Knjiga k) {
		if(k==null){
			throw new RuntimeException("null knjiga");
		}
		knjige.add(k);
		
	}

	public void obrisiKnjigu(Knjiga k) {
		if(k==null){
			throw new RuntimeException("null knjiga");
		}
			knjige.remove(k);
		
	}

	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	public LinkedList<Knjiga> pronadjiKnjigu(Autor a, long isbn, String naslov, String izdavac) {
		if(a == null || isbn==0 || naslov==null || izdavac==null){
			throw new RuntimeException("mporate uneti sve");
		}
		
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		for(int i=0;i<knjige.size();i++){
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}

}
