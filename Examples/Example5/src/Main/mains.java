package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import arrayList.Empleado;
import ui.Clientes;

public class mains {

	public static void main(String[] args) {
		
		//Collection
		//Declarando Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		Clientes cl1 = new Clientes("Maria Elena", "0001", 200000);
		Clientes cl2 = new Clientes("Jose Perez", "0002", 250000);
		Clientes cl3 = new Clientes("Gabriela Gomez", "0003", 260000);
		Clientes cl4 = new Clientes("Javier Lopez", "0004", 270000);
		
		Set<Clientes> ClientesBanco = new HashSet<Clientes>();
		ClientesBanco.add(cl1);
		ClientesBanco.add(cl2);
		ClientesBanco.add(cl3);
		ClientesBanco.add(cl4);
		
		//Programacion Generico
		Empleado ListaEmpleado[] = new Empleado[3];
		ListaEmpleado[0]= new Empleado("Ana",45,25000 );
		ListaEmpleado[1]= new Empleado("Maria",46,25000 );
		ListaEmpleado[2]= new Empleado("Ruth",47,25000 );
		
		ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
		ListaEmpleados.add(new Empleado("Ana",45,25000));
		ListaEmpleados.add(new Empleado("Maria",46,25000));
		ListaEmpleados.add(new Empleado("Ruth",47,25000));
		
		for (Empleado empleado : ListaEmpleados) {
			
		}


	}

}
