package ui;

import java.util.Date;

public class Clases {

	// Atributos:
	int id;
	public String name;
	public String speciality;
	public String email;

	// Declarando metodo constructor
	public Clases() {
		super();
	}

	// Creando Metodo
	public void showName() {
		System.out.println(name);
	}

	// Clase Anidada
	public static class Citas{
		private int id;
		private Date date;

		public Citas(Date date) {
			this.date = date;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

	}

}
