package Practica4;

public class Pixel extends Coordenada{
	private int color;
	
	public Pixel(Integer x, Integer y, Integer color){
		super(x,y);
		this.color = color;
	}
	
	@Override
	public void sumar(Tupla t){
		super.setE1((Integer)super.getE1() + (Integer)t.getE1());
		super.setE2((Integer)super.getE2() + (Integer)t.getE2());
	}
}