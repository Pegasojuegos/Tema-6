package tad;

public class PruebaPila {

	public static void main(String[] args) {
		PilaDeObjetos pila=new PilaEstática();
		for(int i=1;i<=10;i++) {
			pila.push(i);
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}

}
