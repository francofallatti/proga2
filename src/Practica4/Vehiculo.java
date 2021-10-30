package Practica4;

//punto 3 practica 4 Ejemplo Polimorfismo
//https://www.youtube.com/watch?v=RXcUTWczbag 

public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public String mostrarDatos() {
		return "Matricula: "+matricula + "\n" + "Marca: "+marca + "\n" + "Modelo: "+modelo + "\n";
		}
}
