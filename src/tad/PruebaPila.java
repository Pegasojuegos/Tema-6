package tad;

import PilaD.Pila;

public class PruebaPila {

	public static void main(String[] args) {
		Pila<Character> pila=new Pila<Character>();
		for(int i=0;i<=8462;i++) {
			pila.push((char)('A'+i));
		}
		System.out.println(pila);
		System.out.println(pila.toString2());
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		pila.pop();
	}

}
