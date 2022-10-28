package dol;

public class Methodos {

	//Declarando metodo constructor
	int id;
	String name;
	String Speciallity;
	
	public Methodos() {
		
	}
	          //Metodos SobreCargados
	 // Los dos parámetros y el valor de retorno son de tipo int
	  public int suma(int a, int b) {
	    return a + b;
	  }

	  // Los dos parámetros y el valor de retorno son de tipo float
	  public float suma(float a, float b) {
	    return a + b;
	  }

	  // Un parámetro es de tipo int, mientras que el otro parámetro
	  // y el valor de retorno son de tipo float
	  public float suma(int a, float b) {
	    return a + b;
	  }
	
}
