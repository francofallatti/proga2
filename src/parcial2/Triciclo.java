package parcial2;

public class Triciclo extends Vehiculo{

	public Triciclo(int x, int y, String nombre) {
		super(x, y, nombre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean Equals(Object object) {
		if (object instanceof Triciclo) {
			return true;
		}else {
			return false;
		}
	}
}
