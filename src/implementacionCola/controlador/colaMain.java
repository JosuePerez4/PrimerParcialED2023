package implementacionCola.controlador;

import implementacionCola.modelo.Cola;

public class colaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola<Integer> c = new Cola <Integer> ();
		c.encolar(1);
		c.encolar(2);
		c.encolar(3);
		c.encolar(4);
		c.encolar(5);
		c.encolar(6);
		c.encolar(7);
		c.encolar(8);
		c.encolar(9);
		c.encolar(10);
		System.out.println("Primer dato encolado: "+c.primero());
		System.out.println("Dato desencolado: "+c.desencolar());
		System.out.println("Primer dato encolado: "+c.primero());
		System.out.println("Último dato encolado: "+c.ultimo());
	}

}
