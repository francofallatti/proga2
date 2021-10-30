package Practica4;

public class VehiculoTurismo extends Vehiculo{
	private int _numeroPuertas;
	
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		_numeroPuertas = numeroPuertas;
	}

	public int get_numeroPuertas() {
		return _numeroPuertas;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula + "\n"+ "Marca: "+marca+ "\n" + "Modelo: "+modelo+ "\n" + "Numero de puertas: " + _numeroPuertas+ "\n";
		
	}
}