package tad;

public class PruebaPila {

	public static void main(String[] args) {
		PilaDeObjetos<Character> pila=new PilaEstática<Character>();
		for(int i=0;i<=30;i++) {
			pila.push((char)(' '+i));
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}

}
