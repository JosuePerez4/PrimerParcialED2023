package implementacionCola.modelo;

import LinkedList.LinkedList;

public class Cola <E> {
	
	private LinkedList <E> cola;

	public Cola() {
		this.cola = new LinkedList<E>();
	}

	public LinkedList<E> getCola() {
		return cola;
	}

	public void setCola(LinkedList<E> cola) {
		this.cola = cola;
	}
	
	public void encolar (E element) {
		cola.addFirst(element);
	}
	
	public E desencolar () {
		return cola.removeLast();
	}
	
	public E primero () {
		return cola.getLastElement();
	}
	
	public E ultimo () {
		return cola.getFirstElement();
	}
}
