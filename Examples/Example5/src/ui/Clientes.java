package ui;

public class Clientes {

	private String nombre;
	private String ncuenta;
	private double saldo;
	
	public Clientes(String nombre, String ncuenta, double saldo) {
		super();
		this.nombre = nombre;
		this.ncuenta = ncuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNcuenta() {
		return ncuenta;
	}

	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
