package parcial2;

public class Vehiculo4Ruedas extends Vehiculo{

	public Vehiculo4Ruedas(int x, int y, String nombre) {
		super(x, y, nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean Equals(Object object) {
		if (object instanceof Vehiculo4Ruedas) {
			return true;
		}else {
			return false;
		}
	}
}
