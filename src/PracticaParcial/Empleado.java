package PracticaParcial;

abstract public class Empleado {
	protected Integer dni;
	protected String nombre;
	protected Integer sueldobase;
	
	@Override
	public String toString() {
		return dni.toString() + nombre + sueldobase.toString();
	}
}
