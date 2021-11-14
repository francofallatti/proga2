package parcial2;

public class VehiculoNRuedas extends Vehiculo{

	public VehiculoNRuedas(int x, int y, String nombre) {
		super(x, y, nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean Equals(Object object) {
		if (object instanceof VehiculoNRuedas) {
			return true;
		}else {
			return false;
		}
	}
}
