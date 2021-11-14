package parcial2;


public class Vehiculo {
	protected Tupla<Integer, Integer> coodenada;
	protected String nombre;
	public Vehiculo(int x, int y, String nombre) {
		coodenada = new Tupla<Integer, Integer>(x,y);
		nombre = nombre;
	}
	
	public boolean Equals(Object object) {
		if (object instanceof Vehiculo) {
			return true;
		}else {
			return false;
		}
	}

}
//Dar un ejemplo de polimorfismo con que utilice el equals de al menos tres de estas clases.
//Al sobreescribir el metodo Equals realizo polimorfismo cuando cambio la comparacion del objeto recibido con el de la 
//clase en la que se implementa: object instanceof Vehiculo, object instanceof Vehiculo4Ruedas, object instanceof VehiculoNRuedas, object instanceof Triciclo

