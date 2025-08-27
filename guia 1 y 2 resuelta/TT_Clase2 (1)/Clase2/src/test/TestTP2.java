package test;

import modelotp2.*;

public class TestTP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1 = new Punto(1, 5);
		Punto p2 = new Punto(2, 8);
		
		
		
		System.out.println("Distancia entre el p1 y el p2: " + p1.calcularDistancia(p2));
	
		Circulo c1 = new Circulo(p1, 2);
		Circulo c2 = new Circulo(p2, 5);
		
		System.out.println("Distancia entre el c1 y el c2: " + c1.calcularDistancia(c2));
		
	}
}
