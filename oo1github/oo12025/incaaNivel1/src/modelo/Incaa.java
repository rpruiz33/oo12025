package modelo;
import modelo.Pelicula;

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
		
		
		public boolean agregarPelicula(String pelicula)throws Exception {
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
				System.out.println("el id es "+id);
			}
				return catalogo.add(new Pelicula(id,pelicula));
		}
	
		@Override
		public String toString() {
			return "Incaa [catalogo=" + catalogo + "]";
		}
	
		
		public Pelicula traerPelicula(int idPelicula) {
			Pelicula peli1 = null;
			int  i=0;
			
			while(i<catalogo.size() && peli1==null) {
				if (catalogo.get(i).getIdPelicula() != idPelicula) {
			peli1=null;
				}	else {
			
					peli1=catalogo.get(i);
			
				}
		
				i++;
		
		}
			return peli1;
		
		}
	
	
	public List<Pelicula> traerPelicula(String partPelicula){
		List<Pelicula> listaAux=new ArrayList();
		int i=0;
		while(i<catalogo.size() ) {
		if(catalogo.get(i).getPelicula().equals(partPelicula)) {
			listaAux.add(catalogo.get(i));
		}
		i++;
		
	}
	
		return listaAux;
	}
	
	public void modificarPelicula(int idPelicula, String pelicula) throws Exception {
		Pelicula peli=null;
		
	peli=traerPelicula( idPelicula);
	
			  if(peli==null) {
					throw new Exception("no existe la pelicula");	
			  
			  }
			  else {
	
		  peli.setPelicula(pelicula);
	
	}
	}
	
	public boolean eliminarPelicula(int idPelicula) throws Exception  {
		
		Pelicula peli=null;
		
	peli=traerPelicula( idPelicula);
	
			  if(peli==null) {
					throw new Exception("no existe la pelicula");	
			  
			  }
			  
	
	 return catalogo.remove(peli);
	
			
		
		
	}
	
	
	}
