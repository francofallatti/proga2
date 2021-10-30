package Practica4;

abstract public class Perro {
	
	private String _ladrido;
	private int _patas;
	
	public Perro(String ladrido, int patas) {
		_ladrido = ladrido;
		_patas = patas;
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
		
	}
	
	public static class Caniche extends Perro{
		
		public Caniche(String ladrido, int patas) {
			super(ladrido, patas);
		}
	}
}
