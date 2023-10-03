package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//indicamos con el int el num1
		final double num1;
		
		int a;
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimos en consola que nos diga el numero
		System.out.println("Escribe un numero");
		
		num1 = sc.nextDouble();
		
		if (num1 <=1 && num1 >=-1 && num1!=0){
			System.out.println("es un numero casi-cero");
			}
		 else { 
		System.out.println("no es un numero casi-cero");
	}
		
	}
}
