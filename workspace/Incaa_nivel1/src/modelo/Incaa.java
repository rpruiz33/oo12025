package modelo;
import modelo.Pelicula;
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
		
		
		if(catalogo.size()>=1) {
			id=catalogo.get(catalogo.size()-1).getIdPelicula()+1;
		}
		Pelicula p=new Pelicula(id,pelicula);
		return catalogo.add(p);
	}

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + "]";
	}

	
public Pelicula traerPelicula(int idPelicula) throws Exception{
	Pelicula peli1 = null;
	int  i=0;
	
	while(i<catalogo.size() && peli1==null) {
		if (catalogo.get(i).getIdPelicula() != idPelicula) {
			peli1 = null;
			

		}	if (catalogo.get(i).getIdPelicula()==idPelicula) {
			
			throw new Exception("la pelicula ya existe");
		}
		i++;

}
	return peli1;





}
}
