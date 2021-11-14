package Practica4;



abstract public class Perro {
	
	private String _ladrido;
	private int _patas;
	
	public Perro(String ladrido, int patas) {
		_ladrido = ladrido;
		_patas = patas;
	}
	
	public boolean leGustaSalirAPasearCon(Perro otroPerro) {
		if(!(otroPerro instanceof Perro)) {
			return true;
		}
		return false;
		
	}
	
	public String ladrar() {
		return _ladrido;
	}
	
	public int cantidanPatas() {
		return _patas;
	}
	
	public static class Cocker extends Perro{
		
		public Cocker(String ladrido, int patas) {
			super(ladrido, patas);
		}
		@Override
		public boolean leGustaSalirAPasearCon(Perro otroPerro) {
			if(otroPerro instanceof Cocker) {
				return false;
			}
			return true;
			
		}
		
	}
	
	public static class Caniche extends Perro{
		
		public Caniche(String ladrido, int patas) {
			super(ladrido, patas);
		}
		
		@Override
		public boolean leGustaSalirAPasearCon(Perro otroPerro) {
			if(otroPerro instanceof Caniche) {
				return false;
			}
			return true;
		}	
	}
	
	
}
	/**
	 Agregar el método

	Bool leGustaSalirAPasearCon(Perro otroPerro)  asumiendo que a los perros solo les gusta salir a pasear con perros de otra raza.

	Explicar en qué clases debe estar. Implementarlo en las clases que sea necesario, justificando porque hay que hacerlo ahí.
	 * */
	
	
