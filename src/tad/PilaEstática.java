package tad;

public class PilaEstática implements PilaDeObjetos{
	protected Object pila[];

	public PilaEstática() {
		pila=new Object[0];
	}
	
	@Override
	public boolean push(Object o) {
		Object nuevo[]=new Object[pila.length+1];
		for(int i=0;i<pila.length;i++) {
			nuevo[i]=pila[i];
		}
		pila=nuevo;
		pila[pila.length-1]=o;
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (pila.length==0) {
			return true;
		}
		return false;
	}

	@Override
	public Object pop() {
		if(pila.length>0) {
			Object res;
			Object nuevo[]=new Object[pila.length-1];
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
