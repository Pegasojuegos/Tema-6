package PilaD;

public class Nodo<T> {
	public T elemento;
	public Nodo<T> enlace;

	public Nodo(T obj,Nodo<T> enlace) {
		this.elemento=obj;
		this.enlace=enlace;
	}
	
	public String toString() {
		StringBuilder res=new StringBuilder();
		res.append("|");
		res.append(elemento);
		res.append("|\n");
		if(enlace!=null)
		res.append(enlace.toString());
		else res.append("___");
		return res.toString();
	}
}
