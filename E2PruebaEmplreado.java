package E2E3E4;

import java.util.Scanner;

import E5E7E8E9.Punto2D;

//CLASE PRINCIPAL
public class E2PruebaEmplreado {
	
	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("jose", 18);
		 
		
		e1.setSueldo(1200);
		e1.getSueldo();
	}
}



  class Empleado{
	private String nombre; // ENCAPSULANDO NOMBRE
	private int edad;// ENCAPSULANDO EDAD
	private int sueldo;//ENCAPSULAMIENTO DE SUELDO
	static String password="RECUHU1234"; //MISMA VARIABLE PARA TODOS LOS OBJETOS
	
	Scanner sc = new Scanner(System.in);
	
	//GETTER DE NOMBRE
	public String getNombre2() {
		return nombre;
	}
	
	

	//SETTER DE NOMBRE
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//GETTER DE EDAD
	public int getEdad() {
		return edad;
	}


	//SETTER DE EDAD
	public void setEdad(int edad) {
		this.edad = edad;
	}


	//GETTER DE SUELDO
	public void getSueldo() {
		System.out.println("**Consultando sueldo**");
		System.out.println("Ingrese password:");
		String password= sc.nextLine();
		if(password.equals(this.password)) { System.out.println("El sueldo del empleado es:" + sueldo);}
		else{ throw new IllegalArgumentException("password incorrecta!");}
		
	}


	//SETTER DE SUELDO
	public void setSueldo(int sueldo) {
		System.out.println("**Ingresando Sueldo**");
		System.out.println("Ingrese password:");
		String password= sc.nextLine();
		if(password.equals(this.password)) {
			System.out.println("password correcto!");
			System.out.println("El nuevo sueldo es de: "+sueldo);
			this.sueldo = sueldo;
			}
		else{ throw new IllegalArgumentException("password incorrecto!");}
		
	}



	//CONSTRUCTOR 
	public Empleado(String nombre, int edad) {
		  
		  if(edad >= 18) {
			  this.edad= edad;
			  this.nombre= nombre;
			  System.out.println("Objeto creado con exito!");
		  }
		  else {throw new IllegalArgumentException("La edad minima obligatoria es 18");}
	  }
	
	
	//Ejercicio E3
	
	//La solucion que se propone es erronea, ya que un metodo estatico no puede acceder directamente a las varibales de instancia
	//Porque estas variables pertenecen a la instancia de la clase, no a la clase en si.
	//Si queremos acceder a las variables como estatico, debemos modificar la variable nombre y ponerla como Static.
	// Y podriamos acceder a ella directamente como Empleado.Nombre
	
	//Si queremos acceder a las variables de instancia, lo hariamos con un metodo getters no estatico.
	
	//public  String getNombre() {
		//return nombre;
	//}
}
  
  
  
  



