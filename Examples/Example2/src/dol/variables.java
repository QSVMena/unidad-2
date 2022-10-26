package dol;

public class variables {
	
	public static void updatingvaribles() {
		
		//Declarando una variable
	    int speed=10;
	    //Asignamos un valor a una variable
	    System.out.println(speed);

	    int salary = 1000;
	    String employeeName = "Anahí Lopez";
	    System.out.println(employeeName);

	}
	
	public static void EndVariables() {
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println("bono: "+salary);

        //pension: $50 descuento
        salary = salary - 50;
        System.out.println("Descuento: " +salary);

        //2 horas extra $30 c/u
        //Comida: $45

        salary = salary + (30*2) - 45;
        System.out.println("Salario Total: " + salary);

        //Actualizando cadenas de texto
        String employeeName = "Anahí Perez";
        System.out.println("Tu nombre es: " + employeeName);


    }
	


}
