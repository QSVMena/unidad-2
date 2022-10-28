package dal;
import ui.Clases;

//Hereda de la clase "Clases".
public class Patient extends Clases {

	// Implementando metodos Get y Set
	private String name;

	public String getName() {
		return "Patient name is " + this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	// Polimorfismo: Sobreescritura de metodos
	@Override
	public String toString() {
		return "User: " + name + ", Email: " + email;
	}
}
