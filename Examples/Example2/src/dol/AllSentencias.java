package dol;

import java.util.Scanner;

public class AllSentencias {

	public static void SentenciaIf() {
		boolean isBluetoothEnabled = true; // también podría ser false
		int filesSended = 3;

		if (isBluetoothEnabled) {
			filesSended++;
			System.out.println("Archivo enviado");
		} else {
			System.out.println("El Bluetooth no está activado");
		}

	}

	public static void NotasAlumno4() {

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese las 3 notas del alumno: ");
		var nota1 = s.nextDouble();
		var nota2 = s.nextDouble();
		var nota3 = s.nextDouble();

		var promedioNotas = (nota1 + nota2 + nota3) / 3;
		if (promedioNotas >= 60) {
			System.out.println("Aprobo con : " + promedioNotas);
		} else {
			System.out.println("Reprobo con: " + promedioNotas);
		}
	}

	public static void Arrays() {

	
		String[][] cities = new String[4][2]; // 4 * 2 = 8
		 /*
         * +-------------------------+
         * | Country    |  City      |
         * ---------------------------
         * | Nicaragua  | Managua    |
         * | China      | Pekin      |
         * | Rusia      | Moscu      |
         * | Niacaragua | Esteli     |
         * +-------------------------+
         * */

		cities[0][0] = "Nicaragua";
		cities[0][1] = "Esteli";
		cities[1][0] = "Rusia";
		cities[1][1] = "Moscu";
		cities[2][0] = "China";
		cities[2][1] = "Pekin";
		cities[3][0] = "Nicaragua";
		cities[3][1] = "Managua";
		
		for (int row = 0; row < cities.length; row++) {
			  for (int col = 0; col < cities[row].length; col++) {
			    System.out.println(cities[row][col]);
			  }
		}	  
	 
	}

}
