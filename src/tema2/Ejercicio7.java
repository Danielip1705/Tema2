package tema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//indicamos la variable int con num
		int num;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos escriba un numero
		System.out.println("Introduce un numero");
		
		//escribimos el num
		num = sc.nextInt();
		
		//indicamos con if que si num es menor que 9, que imprima en consola que tiene 1 cifra
		if (num<=9){
			System.out.println(num +" tiene 1 cifra");
			
		//indicamos con if else que si num es menor que 99 que imprima en consola que tiene 2 cifras
		} else if (num<=99){
			System.out.println(num +" tiene 2 cifras");
			
		//indicamos con if else que si num es menor que 999 que imprima en consola que tiene 3 cifras
		} else if (num<=999) {
			System.out.println(num + " tiene 3 cifras");
			
		//indicamos con if else que si num es menor que 999 que imprima en consola que tiene 4 cifras
		} else if (num<=9999) {
			System.out.println(num + " tiene 4 cifras");
			
		//indicamos con if else que si num es menor que 9999 que imprima en consola que tiene 5 cifras
		} else if (num<=99999) {
			System.out.println(num + " tiene 5 cifras");
		} 
		//cerramos scanner
		sc.close();
		
	}

}
