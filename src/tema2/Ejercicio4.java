package tema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//indicamos con la variable int num1 y num2
		int num1;
		int num2;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que escriba el primer numero
		System.out.println("Escriba el primer numero");
		
		//escribimos el num1
		num1 = sc.nextInt();
		
		//imprimimos en consola que escriba el segundo numero
		System.out.println("Escriba el segundo numero");
		
		//escribimos el segundo numero
		num2 = sc.nextInt();
		
		//declaramos con if que si num1 es menor que num2, que imprima en consola que num1 es menor que num2
		if (num1<num2){
			
			//imprimimos la respuesta
			System.out.println(num1+  " es menor que " + num2  );
		// y si no cumple los requisitos anteriores, que imprima en consola que num2 es menor que num1
		} else {
			
			//imprimimos la respuesta
			System.out.println(num2 + " es menor que " + num1 );
		}
		//cerramos el scanner
		sc.close();
	}

}
