package dol;

public class UsoThis {

	 static int id = 0;
	  String name;
	  String speciality;

	  // SobreCarga de Constructores usando "This"
	  public UsoThis() {
	    this.name = "Nombre por defecto";
	    this.speciality = "Especialidad por defecto";
	  }

	  public UsoThis(String name, String speciality) {
	    this.name = name;
	    this.speciality = speciality;
	  }
}
