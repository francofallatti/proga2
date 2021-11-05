package AAB;

public class AB2 {
	private class Nodo{
		Integer dato;
		Nodo hijoIzq;
		Nodo hijoDer;
		public Nodo(Integer dato) {
			super();
			this.dato = dato;
		}
		public Integer getDato() {
			return dato;
		}
		public void setDato(Integer dato) {
			this.dato = dato;
		}
		public Nodo getHijoIzq() {
			return hijoIzq;
		}
		public void setHijoIzq(Nodo hijoIzq) {
			this.hijoIzq = hijoIzq;
		}
		public Nodo getHijoDer() {
			return hijoDer;
		}
		public void setHijoDer(Nodo hijoDer) {
			this.hijoDer = hijoDer;
		}
		

	}
	Nodo raiz;
	public AB2() {
		raiz=null;
	}
	public boolean vacio(){
		return raiz == null;
	}
	public void insertar(Integer valor)
	{
		if (vacio())
			raiz = new Nodo(valor);
		else
			raiz = insertar (raiz, valor);
	}
	private Nodo insertar(Nodo nodo, Integer valor)
	{
		if (nodo.getHijoIzq()==null)
		{
			nodo.setHijoIzq(new Nodo(valor));
			return nodo;
		}
		if (nodo.getHijoDer()==null)
		{
			nodo.setHijoDer(new Nodo(valor));
			return nodo;
		}
		nodo.setHijoIzq(insertar(nodo.getHijoIzq(),valor));
		return nodo;
	}
	
	public String toString()
	{
		return toString(raiz);
	}
	private String toString(Nodo nodo)
	{
		if (nodo==null)
			return "";
		return toString(nodo.getHijoIzq()) + ", " + nodo.getDato() + ", " + toString(nodo.getHijoDer());
	}
}
