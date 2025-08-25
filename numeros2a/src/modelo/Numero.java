package modelo;

public class Numero {
private int n;

public int sumar(int n1){
	return n1+this.n;
	
}
public int multiplicar(int n1) {
	return n1*n;
	
}


public boolean esPar(){
	return this.n%2==0;
	
	
	
}

public boolean esPrimo(int n) {
    boolean flag = false;
    int i=1;
    int cont=0;
    if(n<=0) {
    	flag=false;
    	cont=2;
    }

    	while(i<n&& cont!=2) {
    		if(n%i==0) {
    			i++;
    			flag=false;
    			cont++;
    			;
    		
    		}
    		else {
    			flag=true;
    			i++;
    		}
    	}
    
    return flag;
}


public String convertirAString() {
	String s="";

	
return s.valueOf(n);

	
	
}

public double convertirDouble() {
	String n1="";

	double num=0;
	num=Double.parseDouble(	n1.valueOf(n));

	return num;
	
}

public double calcularPotencia(int exp) {
	
	return Math.pow(this.n,exp);
	
	
	
}

public int calcularFactorial() {
	
	int factorial=0;
	if(n<=0) {
		factorial=1;
	}
	
	for (int i=1;i<n;i++) {
		factorial=i*(i+1);
		
	}
	
	return factorial;
	
	
	
	
}


public int numeroCombinatorio(int n1) {
	
    if (n < 0 || n1 < 0 || n1 > n) {
        throw new IllegalArgumentException("n y n1 deben ser positivos y n >= n1");
    }

    Numero numN = new Numero(this.n);
    Numero numN1 = new Numero(n1);
    Numero numNmenosN1 = new Numero(this.n - n1);

    return numN.calcularFactorial() /
           (numN1.calcularFactorial() * numNmenosN1.calcularFactorial());

}



public Numero(int n) {
	super();
	this.n = n;
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}








}
