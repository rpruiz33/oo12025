package test;

import modelotp1.*;
import modelotp2.Circulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Paciente pacienteFlujo1 = new Paciente("Gustavo", "Siciliano", 11111111);
	
		Paciente pacienteFlujo2 = new Paciente("Gustavo", "Siciliano", 11111111);
	
		System.out.println("El nombre del paciente 1 es: " + pacienteFlujo1.getNombre());
		pacienteFlujo1.setPeso(82);
		
		
		Medico medico = new Medico("medico 1");
		System.out.println("El Imc del paciente " +
							pacienteFlujo1.getNombre() +
							" es igual a: " +
							medico.calcularIMC(pacienteFlujo1));
		
		System.out.println(pacienteFlujo1.equals(pacienteFlujo2));
		
		
		
	}

}
