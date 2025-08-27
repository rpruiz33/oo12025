package modelotp2;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double calcularDistancia(Punto punto) {
		return Math.sqrt(
				Math.pow(punto.getX() - this.x, 2) +
				Math.pow(punto.getY() - this.y, 2)
			);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean equals(Punto punto) {
		return this.x == punto.getX() && this.y == punto.getY();
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
