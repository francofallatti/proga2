package Practica4;

abstract public class Empleado {
	protected Integer dni;
	 protected String nombre;
	 protected Integer sueldobase;
	 
	 public String toString() {
	 return dni.toString() + nombre + sueldobase.toString();
	 }
	 
	 public class Ejecutivo extends Empleado{
		 private Integer sueldoadicional;
		 
		 /**
		  * @Override
 			public String toString() {
 				return dni.toString() + nombre + sueldobase.toString() + sueldoadicional.toString();
 			}
	
		a) Reescribir Ejecutivo.toString() para evitar repetir código.
		b) Que propiedad de la herencia está utilizando? Explique.
		  */
		 
		 @Override
		 public String toString() {
			 return super.toString() + sueldoadicional.toString();
			 } 
	 }
}
