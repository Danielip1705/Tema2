package tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		String jugador1;
		String jugador2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jugador 1 Eliga [PIEDRA] [TIJERAS] o [PAPEL]");
		
		jugador1 = sc.next();
		
		System.out.println("Jugador 2 Eliga [PIEDRA] [TIJERAS] o [PAPEL]");
		
		jugador2 = sc.next();
		
		if (jugador1==PIEDRA&&jugador2==PIEDRA) {
			System.out.println("Empate");
		} else if (jugador1==PAPEL&&jugador2==PAPEL) {
			System.out.println("Empate");
		} else if (jugador1==TIJERAS&&jugador2==TIJERAS) {
			System.out.println("Empate");
		}
		
		

		
		
	}

}
