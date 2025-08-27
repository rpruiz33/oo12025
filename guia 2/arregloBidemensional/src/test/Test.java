package test;

import modelo.ArregloBidimencional;

public class Test {

	public static void main(String[] args) {
		
		double matriz[][] = { { 1, 2, 3 },
				   			  { 1, 2, 3 } };
		double matriz2[][]= {{1,1},
							{2,2},
							{3,3}};
		ArregloBidimencional b=new ArregloBidimencional(matriz);
		double [][]c=b.sumar(matriz);
		System.out.println("\n*****************");
		b.mostrar(c,matriz.length,matriz[0].length);
		double [][]d=b.restar(matriz);
		System.out.println("\n*****************");
		b.mostrar(d,matriz.length,matriz[0].length);
		System.out.println("\n*****************");
		double [][]e=b.traspuesta();
		System.out.println("\n*****************");
		b.mostrar(e,matriz.length,matriz.length);
		System.out.println("\n*****************");
		double [][]r=b.multiplicar(matriz2);
		b.mostrar(r,matriz2[0].length,matriz.length);
		System.out.println("\n*****************");
		double [][]p=b.multiplicar(10.3);
		b.mostrar(p,matriz.length,matriz[0].length);
		System.out.println("\n*****************");
		
		
	}
	

}
