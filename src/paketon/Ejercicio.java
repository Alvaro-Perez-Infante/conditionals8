package paketon;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		
		// ax2 + bx + c = 0
		
		Scanner teclado = new Scanner(System.in); 
		
		double a;
		double b;
		double c;
		double x1 = 0;
		double x2 = 0;
		double r;
		double interior;
		
		System.out.print("Coeficiente a = ");
		a = Double.parseDouble(teclado.nextLine());
		System.out.print("Coeficiente b = ");
		b = Double.parseDouble(teclado.nextLine());
		
		c = Double.parseDouble(teclado.nextLine());
		
		
		
		interior = (b * b) - (4 * a * c);
		
		if (interior > 0) {
			System.out.print("No tiene solución");
		}else {
			r = Math.sqrt(interior);
			x1 = (-b + r) / (2 * a);
			x1 = (-b - r) / (2 * a);

		System.out.println("Solución 1: " + x1);
		System.out.println("Solución 1: " + x2);
		}
	}

}