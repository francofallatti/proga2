package Practica3;

import java.awt.Container;

public class  TecnologiaJava{
	
	
	
	/**
	String Builder
	1) a) Implementar el método String separarMiles(String numero) que recibe un String que
	representa un número entero y devuelve un String con el mismo número al que se le añadirán los
	puntos separadores de miles.
	
	Por ejemplo, si el método recibe el String "12345678" debe devolver el String "12.345.678"
	b) Calcular la complejidad entre la implementación con String respecto de la implementación con
	StringBuilder.
	 **/
	
	public static String separarMiles(String numero) {
		String auxString = "";
		int cont = 0;
		for (int i=numero.length()-1;i>=0;i--) {
			if(cont%3==0 && cont>0) {
				auxString =numero.charAt(i)+ "." + auxString ;
			}else {
				auxString =  numero.charAt(i) + auxString ;
			}
			cont++;
		}
		return auxString;
	}
	
	public static String separarMilesSb(String numero) {
		StringBuilder sb= new StringBuilder();
		int cont = 0;
		for (int i=numero.length()-1;i>=0;i--) {
			if(cont%3==0 && cont>0) {
				sb.append(".").append(numero.charAt(i)) ;
			}else {
				sb.append(numero.charAt(i));
			}
			cont++;
		}
		return sb.reverse().toString();
	}
	
	public static String separarMilesSb2(String numero) {
		StringBuilder sb= new StringBuilder();
		sb.append(numero);
		sb.insert(2, ".");
		sb.insert(6, ".");
		
		return sb.toString();
	}
	public static String separarMilesSb3(String numero) {
		StringBuilder sb= new StringBuilder();
		int cont = 2;
		sb.append(numero);
		while(cont<numero.length()) {
			sb.insert(cont, ".");
			cont+=4;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(separarMiles("12345678"));
		System.out.println(separarMilesSb("12345678"));
		System.out.println(separarMilesSb2("12345678"));
		System.out.println(separarMilesSb3("12345678"));
		System.currentTimeMillis();
	}

}
