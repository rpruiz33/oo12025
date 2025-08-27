package modelo;

public class ArregloBidimencional {
	private double[][] matrizA;

	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	public ArregloBidimencional(double[][] matrizA) {
		super();
		this.matrizA = matrizA;
	}
	
	
	public double[][] sumar(double[][] matrizB){
		int filas=matrizB.length;
		int columna=matrizB[0].length;
		double[][] matrizC=new double[filas][columna];
		
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columna;j++) {
				matrizC[i][j]=this.matrizA[i][j]+matrizB[i][j];
				
			}
			
		}
	
		
		return matrizC;
	}
	
	
	
	public double[][] restar(double[][] matrizB){
		int filas=matrizB.length;
		int columna=matrizB[0].length;
		double[][] matrizC=new double[filas][columna];
		
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columna;j++) {
				matrizC[i][j]=this.matrizA[i][j]-matrizB[i][j];
				
			}
			
		}
	
		
		return matrizC;
	
	}	
	

public double[][] traspuesta(){
	int filas=matrizA[0].length;
	int columna=matrizA.length;
	double[][] matrizC=new double[filas][columna];
	for(int i=0;i<filas;i++) {
		for(int j=0;j<columna;j++) {
			matrizC[i][j]=matrizA[j][i];
			
		}
		}
	

	
	return matrizC;
	
	
	
	
}


public double[][] multiplicar(double numero){
	int filas=matrizA.length;
	int columna=matrizA[0].length;
	double[][] matrizC=new double[filas][columna];

	for(int i=0;i<filas;i++) {
		for(int j=0;j<columna;j++) {
	
			matrizC[i][j]=numero*matrizA[i][j];
}
		
}



	return matrizC;

}


//tambien podria haber sido la asignacion de la dimension como la matriz péro
//	int filas=matrizA.length;
//int columna=matrizA[0].length;

public double[][] multiplicar(double [][]matrizB ){
	int filas=matrizB[0].length;
	int columna=matrizB.length;
	double [][] resultado= new double[filas][columna];

	for (int i = 0; i <filas; i++) {
		for (int j = 0; j <columna ; j++) {
			for (int k = 0; k < columna; k++) {
                resultado[i][j] = resultado[i][j]+ matrizA[i][k] * matrizB[k][i];
            }
	}
	
	//acaa se hace el bucle de las columnaas 2 veces pq es colunmna de * fila=columna de la otra
}
	return resultado;
}


public void mostrar (double [][]matrizB,int fila, int columna) {
	for (int i = 0; i <fila; i++) {
		System.out.println();
		for (int j = 0; j <columna; j++) {
			System.out.print(" "+matrizB[i][j]);
		}
		}
	
	
}


}

