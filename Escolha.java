package escolha;
import java.util.Scanner;

public class Escolha {
	static Scanner entrada= new Scanner (System.in);
	
	public static void  triangulo() {
		int base , altura, area;
		
		System.out.println("-----------\n"
				+ "Digite a base");
    	base= entrada.nextInt();
    	
    	System.out.println("Digite sua altura");
    	altura= entrada.nextInt();
    	
    	area= (base*altura)/2;
    	
    	System.out.println("A área do triângulo é "+area+".");
    	
	}
	public static void retangulo() {
		int base , altura, area;
		
		System.out.println("-----------\n"
				+ "Digite a base");
    	base= entrada.nextInt();
    	
    	System.out.println("Digite a altura");
    	altura= entrada.nextInt();
    	
    	area= base*altura;
    	
    	System.out.println("A área do retângulo é "+area+".");
	}
	public static void circulo() {
		double raio, area;
		
		System.out.println("-----------\n"
				+ "Digite a raio");
		raio= entrada.nextInt();
		
		area= (raio*raio)*3.14;
		
		System.out.println("A área do círculo é "+area+".");
		
	}
	public static void main (String args[]) {
		int escolha,cont=0;
		
		do {
			if(cont>0) {
				System.out.println("Opção inválida. Tente novamente");
			}
			System.out.println ("Qual será a figura que sera calculada? \n"
					+ "1. triângulo\n"
					+ "2. retângulo\n"
					+ "3. círculo");
	    	escolha= entrada.nextInt();
	    	cont++;
		}while((escolha>3) || (escolha<1));
    	
    	if (escolha==1) {
    		triangulo();
    		
    	}else if (escolha==2) {
    		retangulo();
    	
    	}else{
    		circulo();
    	}

	}
	
}
