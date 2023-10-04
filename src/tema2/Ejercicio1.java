package tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//indicamos con la variable int el num1
		int num1;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos diga un numero
		System.out.println("Dime un numero");
		
		//escribimos el num1
		num1 = sc.nextInt();
		
		
		//declaramos con if que si num1 es = 0 es par, y si no lo es, impar
		if (num1%2 == 0){
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
			
		}
		//cerramos scanner
		sc.close();
		
		
	}

}
