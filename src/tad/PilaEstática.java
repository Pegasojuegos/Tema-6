package tad;

public class PilaEstática<T> implements PilaDeObjetos<T>{
	protected T pila[];

	public PilaEstática() {
		pila=(T[]) new Object[0];
	}
	
	@Override
	public boolean push(T o) {
		T nuevo[]=(T[]) new Object[pila.length+1];
		for(int i=0;i<pila.length;i++) {
			nuevo[i]=pila[i];
		}
		pila=nuevo;
		pila[pila.length-1]=o;
		return true;
	}

	@Override
	public boolean isEmpty() {
		if (pila.length==0) {
			return true;
		}
		return false;
	}

	@Override
	public T pop() {
		if(pila.length>0) {
			T res;
			T nuevo[]=(T[]) new Object[pila.length-1];
			for(int i=0;i<nuevo.length;i++) {
				nuevo[i]=pila[i];
			}
			res=pila[pila.length-1];
			pila=nuevo;
			return res;
		}
		return null;
	}

}
