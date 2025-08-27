package modelotp2;

public class Circulo {

	private Punto punto;
	private double radio;
	
	public Circulo(Punto punto, double radio) {
		super();
		this.punto = punto;
		this.radio = radio;
	}
	
	public double calcularDistancia(Circulo circulo) {
		return punto.calcularDistancia(circulo.getPunto());
	}
	
	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
