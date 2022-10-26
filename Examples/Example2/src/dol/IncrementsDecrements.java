package dol;

public class IncrementsDecrements {

	public static void InDecrements() {

        int lives = 5;
        lives = lives - 1;
        
        lives--; //Decremento
       
        lives++; //Incremento
        
        //Prefija
        // Gana un regalo por ganar una vida
        int gift = 100 + ++lives; //prefijo
        System.out.println("Regalos: "+gift);
        System.out.println(lives); //5


    }
}
