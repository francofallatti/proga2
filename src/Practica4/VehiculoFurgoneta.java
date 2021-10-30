package Practica4;

public class VehiculoFurgoneta extends Vehiculo{
	private int _carga;
	
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		_carga=carga;
	}

	public int get_carga() {
		return _carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+ "\n" + "Marca: "+marca+ "\n" + "Modelo: "+modelo+ "\n" + "Carga: " + _carga+ "\n";
	}
	
}
