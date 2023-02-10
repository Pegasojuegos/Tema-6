package PilaD;

import tad.PilaDeObjetos;

public class Pila<T> implements PilaDeObjetos<T> {
	protected Nodo<T> cima;

	public Pila(){
		cima=null;
	}
	
	@Override
	public boolean push(T o) {
		Nodo<T> nodo=new Nodo<T>(o, cima);
		cima=nodo;
		return false;
	}

	@Override
	public boolean isEmpty() {
		return cima==null;
	}

	@Override
	public T pop() {
		if(isEmpty())return null;
		T obj=cima.elemento;
		cima=cima.enlace;
		return obj;
	}
	
	public String toString() {
		return cima.toString();
	}
	
	public String toString2() {
		Nodo<T> cursor=cima;
		StringBuilder res=new StringBuilder();
		while(cursor!=null) {
			res.append("|");
			res.append(cursor.elemento);
			res.append("|\n");
			cursor=cursor.enlace;
		}
		res.append("___");
		return res.toString();
	}
	
}
