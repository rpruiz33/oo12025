package test;

import java.util.ArrayList;
import java.util.List;

import modelo.Incaa;
import modelo.Pelicula;

public class Test {

	public static void main(String[] args) {
		List<Pelicula> lstPeliculas = new ArrayList<Pelicula>();

		Incaa incaa = new Incaa(lstPeliculas);

		try {
			incaa.agregarPelicula("robert");
			incaa.agregarPelicula("rober2222222");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(incaa.getCatalogo().toString());

		try {
			System.out.println(incaa.traerPelicula(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(incaa.traerPelicula(("rober2222222").toString()));

		try {
			incaa.modificarPelicula(1, "arquez");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(incaa.getCatalogo().toString());

		try {
			System.out.println(incaa.eliminarPelicula(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(incaa.getCatalogo().toString());
	}
}
