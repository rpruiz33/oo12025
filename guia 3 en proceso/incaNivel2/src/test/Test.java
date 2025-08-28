package test;

import java.util.ArrayList;
import java.util.List;

import modelo.Incaa;
import modelo.Pelicula;
import modelo.Genero;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pelicula> lstPeliculas = new ArrayList<Pelicula>();

		Incaa incaa = new Incaa(lstPeliculas);
		Genero g=new Genero(1,  "terror");
		try {
			incaa.agregarPelicula("robert",g);
			incaa.agregarPelicula("rober2222222", g);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(incaa.getCatalogo().toString());
		}

	}


