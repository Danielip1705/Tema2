package tema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos con la variable int el num1 num2 y num3
		int num1;
		int num2;
		int num3;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en la consola que nos escriba el primer numero
		System.out.println("Escribe el primer numero");
		
		//escribimos el num1
		num1 = sc.nextInt();
		
		//imprimimos en la consola que nos escriba el segundo numero
		System.out.println("Escribe el segundo numero");
		
		//escribimos el num2
		num2 = sc.nextInt();
		
		//imprimimos en consola que nos escriba el tercer numero
		System.out.println("Escribe el tercer numero");
		
		//escribimos el num3
		num3 = sc.nextInt();
		
		if (num1>num2 && num2>num3){
		System.out.println(num1 + " es mayor que " + num2 + " y " + num3);
		
		}else if (num2 > num1 && num1>num3) {
			System.out.println(num2 + " es mayor que " + num1 + " y " + num3);
		
		} else if (num3>num2 && num2>num1) {
			System.out.println(num3 + " es mayor que " + num2 + " y " + num1);
			
	} 	else if (num1>num3 && num3>num2) {
		System.out.println(num1 + " es mayor que " + num3 + " y " + num2);
		
	} 	else if (num2>num3 && num3>num1) {
		
		
		System.out.println(num2 + " es mayor que " + num3 + " y " + num1);
		
		
	} 	else if (num3>num1 && num1>num2) {
		
		System.out.println(num3 + " es mayor que " + num1 + " y " + num2);
		
	} else if (num1==num2 && num1>num3){
		
	
		System.out.println(num1 + " es igual a " + num2 + " y mayor que " + num3);
		
		
	} else if (num3==num2 && num2>num1){
		
		System.out.println(num3 + " es igual que " + num2 + " y mayor " + num1);
		
	} else if (num1==num2 && num1<num3) {
		
		System.out.println(num3 + " es mayor que " + num2 + " al cual es igual a " + num1);
		
	
	} else if (num1==num3 && num1<num2) {
		System.out.println(num2 + " es mayor que " + num1 + " al cual es igual a " + num3);
	} else if (num1==num3 && num1>num2) {
		System.out.println(num1 + " es igual que " + num3 + " y mayor " + num2);
	} else if (num1==num2 &&num1==num3) {
		System.out.println("Todos los numeros son iguales");
	}
		sc.close();
	}
}