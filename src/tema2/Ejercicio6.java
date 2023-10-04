package tema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//guardamos con la variable double a,b,c,x,x1
		double a;
		double b;
		double c;
		double x;
		double x1;
		double resultado1;
		double resultado2;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("indica que numero quiere que sea a");
		
		a = sc.nextDouble();
		
		System.out.println("indica que numero quiere que sea b");
		
		b = sc.nextDouble();
		
		System.out.println("indica que numero quiere que sea c");
		
		c = sc.nextDouble();
		x = (-b + Math.sqrt((b*b)-4*a*c));
		x1 = (-b - Math.sqrt((b*b)-4*a*c));
		
		if (Math.sqrt((b*b)-4*a*c) <0) {
			
			System.out.println("no tiene solucion");
		
		} else if (x = (-b + Math.sqrt((b*b)-4*a*c));
		x1 = (-b - Math.sqrt((b*b)-4*a*c));){
			syso
		}
		
		
	}

}
