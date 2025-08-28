package modelo;

public class Pelicula {
	private int idPelcula;
	private String pelicula;
	
	
	
	public  Pelicula(int idPelicula, String pelicula) {
		super();
		this.idPelcula = idPelicula;
		this.pelicula = pelicula;
	}
	public int getIdPelicula() {
		return idPelcula;
	}
	public void setIdPelcula(int idPelcula) {
		this.idPelcula = idPelcula;
	}
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "Pelicula [idPelcula=" + idPelcula + ", pelicula=" + pelicula + "]";
	}

	
	
}
