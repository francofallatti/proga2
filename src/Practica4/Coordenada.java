package Practica4;

public class Coordenada extends Tupla{
	
	public Coordenada(Integer x, Integer y){
		super(x,y);
	}
	
	@Override
	public void sumar(Tupla t){
		super.setE1((Integer)super.getE1() + (Integer)t.getE1());
		super.setE2((Integer)super.getE2() + (Integer)t.getE2());
	}
	
}