package tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//indicamos con la variable int el numero 1
		int num1;
		
		//indicamos con la variable int el numero 2
		int num2;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos escriba el numero 1
		System.out.println("Dime el primer numero");
		
		//escribimos el numero 1
		num1 = sc.nextInt();
		
		//imprimimos en consola que nos escriba el numero 2
		System.out.println("Dime el segundo numero");
		
		//escribe el segundo numero
		num2 = sc.nextInt();
		
		//indicamos con if que si num1 y num2 son iguales que diga en la consola que son iguales,si no, que diga que no son
		if (num1==num2){
		System.out.println("Son iguales");
	} else {
		System.out.println("No son iguales");
	}
		//cerramos scanner
		sc.close();
	}
}
