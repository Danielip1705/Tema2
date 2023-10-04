package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//indicamos con el int el num1
		final double num1;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimos en consola que nos diga el numero
		System.out.println("Escribe un numero");
		
		//escribimos el num1
		num1 = sc.nextDouble();
		
		//declaramos con if que num1 si es menor que 1,mayor que -1 y distinto que 0, que diga que es casi cero
		if (num1 <=1 && num1 >=-1 && num1!=0){
			//imprimimos respuesta
			System.out.println("es un numero casi-cero");
			}
		//y si no cumple los requisitos anteriores, que diga que no es un numero casi cero
		 else { 
		//imprimimos respuesta
		System.out.println("no es un numero casi-cero");
		
	}
	//cerramos scanner
	sc.close();
	}
}
