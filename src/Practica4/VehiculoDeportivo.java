package Practica4;

public class VehiculoDeportivo extends Vehiculo{
	private int _cilindrada;
	
	public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		_cilindrada=cilindrada;
	}
	
	public int get_cilindrada() {
		return _cilindrada;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+ "\n" + "Marca: "+marca+ "\n" + "Modelo: "+modelo+ "\n" + "Cilindradas: " + _cilindrada + "\n";
		
	}
}