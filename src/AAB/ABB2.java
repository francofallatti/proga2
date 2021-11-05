package AAB;

public class ABB2 {
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
		public ABB2() {
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
			if (nodo==null)
				return new Nodo(valor);
			if (nodo.getDato().compareTo(valor)>0)
				nodo.setHijoIzq(insertar(nodo.getHijoIzq(),valor));
			if (nodo.getDato().compareTo(valor)<0)
				nodo.setHijoDer(insertar(nodo.getHijoDer(),valor));
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
