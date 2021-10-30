package Practica4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0]= new Vehiculo("ABC123", "Fiat", "uno");
		misVehiculos[1]= new VehiculoTurismo("78hj", "audi", "p14", 4);
		misVehiculos[2]= new VehiculoDeportivo(156, "asdcv", "ferrari", "a3");//xd raro el modelo jajdjada
		misVehiculos[3]= new VehiculoFurgoneta("ji5", "toyota", "hilux", 2000);
		
		for (Vehiculo vehiculo : misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
		}
		
		Tupla<String,String> t1 = new Tupla<String,String>("a","b");
		Tupla<String,String> t2 = new Tupla<String,String>("c","d");
		Coordenada c1 = new Coordenada(1,2);
		Coordenada c2 = new Coordenada(1,2);
		t1.sumar(t2);
		c1.sumar(c2);
		Tupla<Integer,Integer> t3 = new Pixel(1,2,3);
		Tupla<Integer,Integer>t4 = new Pixel(1,2,3);
		t3.sumar(t3);
		t3.sumar(c2);
		System.out.println(t1.getE1());
		System.out.println(c1.getE1());
		System.out.println(t3.getE1());
		

	}

}
