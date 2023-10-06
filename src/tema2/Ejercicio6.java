package tema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int a, b, c;
		double x;
		double x1;
		long discriminante;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		discriminante=	(long) (Math.pow(b, 2)) - (4 * a * c);
		
		if (discriminante<0) {
			System.out.println("La ecuacion no tiene solucion");
		} else {
			if (a== 0) {
				x= (double) -c/b;
				System.out.println("La ecucacion tiene un única solucion:" + x);
			} else {
				x= -b + Math.sqrt(discriminante) /(2*a);
				x1= -b - Math.sqrt(discriminante) /(2*a);
					System.out.println("La solución de la ecuacion es" +x + x1);
			}
		sc.close();
	}

}
}

