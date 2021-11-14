package parcial2;

public class Auto extends Vehiculo{

	public Auto(int x, int y, String nombre) {
		super(x, y, nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean Equals(Object object) {
		if (object instanceof Auto) {
			return true;
		}else {
			return false;
		}
	}
}
