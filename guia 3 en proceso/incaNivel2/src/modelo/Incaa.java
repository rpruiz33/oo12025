package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	private List<Pelicula> catalogo;

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}
	
	
	
	public Pelicula traerPelicula(Genero genero){
		Pelicula p=null;
		int i=0;
		while(i<catalogo.size() ) {
		if(catalogo.get(i).getPelicula().equals(genero)) {
			p=catalogo.get(i);
		}
		i++;
		
	}
	
		return p;
	}
	
	public boolean agregarPelicula(String pelicula,Genero gen)throws Exception {
		int i=0;
		int id=1;
		while(i<catalogo.size()) {
			if(catalogo.get(i).getPelicula().equals(pelicula)) {
				throw new Exception("la pelicula ya existe");	
			}
			i++;
		}
		
		
		if((catalogo.size())>0) {
			id=catalogo.get(catalogo.size()-1).getIdPelicula()+1;
			
		}
			return catalogo.add(new Pelicula(id,pelicula,gen));
	}

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + "]";
	}
	
	
	
	
}
