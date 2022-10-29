package arrayList;

public class Empleado {

	private String nombre;
	private int edad;
	private double Salario;
	
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", Salario=" + Salario + "]";
	}
	
	
}
