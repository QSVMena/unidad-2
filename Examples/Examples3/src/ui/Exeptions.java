package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class Exeptions {

	public static void exp() {
		        Scanner teclado = new Scanner(System.in);
		        int num;
		        boolean continua;
		        do {
		            try {
		                continua = false;
		                System.out.print("Ingrese un valor entero:");
		                num = teclado.nextInt();
		                int cuadrado = num * num;
		                System.out.print("El cuadrado de " + num + " es " + cuadrado);
		            } catch (InputMismatchException ex) {
		                System.out.println("Debe ingresar obligatoriamente un número entero.");
		                teclado.next();
		                continua = true;
		            }
		        } while (continua);
	}
		    
}
