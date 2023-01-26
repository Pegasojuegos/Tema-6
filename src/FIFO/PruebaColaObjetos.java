package FIFO;

public class PruebaColaObjetos {

	public static void main(String[] args) {

		ColaObjetos<Character> pila=new ColaObjetosE<Character>();
		for(int i=0;i<=30;i++) {
			pila.add((char)('A'+i));
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.remove());
		}
	}

}
