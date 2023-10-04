package tema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//indicamos con la variable double la nota
		double nota;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla que nos diga la nota
		System.out.println("Indica que nota has sacado");
		
		//escribimos la nota
		nota = sc.nextDouble();
		
		//con if indicamos que si la nota es menor que 4.9 que nos imprima insuficiente
		if (nota<=4.9) {
			System.out.println("INSUFICIENTE");
			
		//con if else indicamos que si la nota es menor que 5.9 que nos imprima suficiente
		} else if (nota<=5.9) {
			System.out.println("SUFICIENTE");
			
		//con if else indicamos que si la nota es menor que 6.9 que nos imprima bien
		} else if (nota<=6.9) {
			System.out.println("BIEN");
			
		//con if else indicamos que si la nota es menor que 8.9 que nos imprima notable
		} else if (nota<=8.9) {
			System.out.println("NOTABLE");
			
		//con if else indicamos que si la nota es menor que 10 que nos imprima sobresaliente
		} else if (nota<=10) {
			System.out.println("SOBRESALIENTE");
		}
		//cerramos scanner
		sc.close();
		
		
		
	}

}
