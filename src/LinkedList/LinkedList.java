package LinkedList;

public class LinkedList<E> {

	private Node<E> head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(E element) {
		Node<E> nuevoNodo = new Node<E>(element);
		if (head == null) {
			// Si la lista está vacía, el nuevo nodo se convierte en la cabeza
			head = nuevoNodo;
		} else {
			// Si la lista no está vacía, buscamos el último nodo y lo conectamos al nuevo
			// nodo
			Node<E> actual = head;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevoNodo);
		}
		this.size++;
	}

	// Añade en la posicicón indicada
	public void add(E element, int pos) {
		if (pos < 0) {
		} else if (pos == 0) {
			Node<E> j = new Node<E>(element);
			head = j;
			size++;
		} else {
			Node<E> p = head;
			int pContador = 0;
			while (p.getSiguiente() != null && pContador < pos - 1) {
				pContador++;
				p = p.getSiguiente();
			}
			if (pContador == pos - 1) {
				Node<E> n = new Node<E>(element);
				if (p.getSiguiente() != null) {
					n.setSiguiente(p.getSiguiente());
				}
				p.setSiguiente(n);
				size++;
			}
		}
	}

	/*public void addOrdered(E val) {
		// Se crea el nuevo nodo
		Node <E> nuevo = new Node(val);

		if (head == null) {
			head = nuevo;
			size++;
		} else {
			Node <E> p = head;
			if (p.getDatos() instanceof Integer) {
				if ((int) p.getDatos() > (int) val) {
					// Conecta a cabeza cuando es menor (añade al inicio
					nuevo.setSiguiente(p);
					head = nuevo;
				} else {
					// Conecta a la cola directamente cuando es mayor
					if (p.getSiguiente() == null) {
						p.setSiguiente(nuevo);
					} else {
						// Se agrega que p sea diferente de nulo, pues el seguira preguntando a medida
						// que avance la lista
						while (p != null && (int) p.getDatos() < (int) val) {
							p = p.getSiguiente();
						}
						Node <E> q = head;

						while (q.getSiguiente() != p) {
							q = q.getSiguiente();
						}

						q.setSiguiente(nuevo);
						nuevo.setSiguiente(p);
					}
				}

			} else if (p.getDatos() instanceof Object) {

				Comparable edadComparable = (Comparable) p.getDatos();
				if (edadComparable.compareTo((Comparable) val) > 0) {
					// Conecta a cabeza cuando es menor (añade al inicio
					nuevo.setSiguiente(p);
					head = nuevo;
				} else {
					// Conecta a la cola directamente cuando es mayor
					if (p.getSiguiente() == null) {
						p.setSiguiente(nuevo);
					} else {
						// Se agrega que p sea diferente de nulo, pues el seguira preguntando a medida
						// que avance la lista
						while (p != null && edadComparable.compareTo((Comparable) val) < 0) {
							p = p.getSiguiente();
						}
						// System.out.println("P: " + p.getData());
						// System.out.println("Q: " + q);
						Node <E> q = head;

						while (q.getSiguiente() != p) {
							q = q.getSiguiente();
						}

						q.setSiguiente(nuevo);
						nuevo.setSiguiente(p);
						// System.out.println("q: " + q.getData() );
						// System.out.println("p: " + p.getData());
					}
				}

			} else if (p.getDatos() instanceof String) {
				Comparable<String> strComparable = (Comparable<String>) p.getDatos();
				if (strComparable.compareTo((String) val) > 0) {
					// Conecta a cabeza cuando es menor (añade al inicio)
					nuevo.setSiguiente(p);
					head = nuevo;
				} else {
					// Conecta a la cola directamente cuando es mayor
					if (p.getSiguiente() == null) {
						p.setSiguiente(nuevo);
					} else {
						// Se agrega que p sea diferente de nulo, pues él seguirá preguntando a medida
						// que avance la lista
						while (p != null && strComparable.compareTo((String) val) < 0) {
							p = p.getSiguiente();
						}

						Node <E> q = head;

						while (q.getSiguiente() != p) {
							q = q.getSiguiente();
						}

						q.setSiguiente(nuevo);
						nuevo.setSiguiente(p);
					}
				}

			}
		}
	}*/

	// Añade al inicio de la lista
	public void addFirst(E element) {
		Node<E> nuevoNodo = new Node<E>(element);
		nuevoNodo.setSiguiente(head);
		head = nuevoNodo;
		size++;
	}

	public void addBeforeByValue(int val, int valNodo) {
	}

	public void addAfterByValue(int val, int valNodo) {
	}

	public void addBeforeByPosition(int val, int nodoBuscado) {
	}

	public void addAfterByPosition(int val, int nodoBuscado) {
	}

	public void removeByValue(int valNodo) {
	}

	// Añadir nodo 2 posiciones después de la indicada
	public void addDespuesDeDos(E element, int pos) {
		if (pos < 0) {
		} else if (pos == 0 && head != null && head.getSiguiente() != null
				&& head.getSiguiente().getSiguiente() != null) {
			Node<E> x = new Node<E>(element);
			x.setSiguiente(head.getSiguiente().getSiguiente().getSiguiente());
			head.getSiguiente().getSiguiente().setSiguiente(x);
		}
	}

	public E removeFirst() {
		if (head.getSiguiente() == null) {
			E data = head.getDatos();
			head = null;
			size--;
			return data;
		} else {
			E data = head.getDatos();
			head = head.getSiguiente();
			size--;
			return data;
		}
	}

	// Implementaciones para resolver parcial semestre anterior
	public E removeLast() {
		if (head == null) {
			System.out.println("Pila vacía");
			return null;
		}

		Node<E> nodoFinal = head;
		Node<E> anterior = null;
		while (nodoFinal.getSiguiente() != null) {
			anterior = nodoFinal;
			nodoFinal = nodoFinal.getSiguiente();
		}

		if (nodoFinal == head) {
			E data = head.getDatos();
			head = null;
			size--;
			return data;
		} else {
			E data = nodoFinal.getDatos();
			anterior.setSiguiente(null);
			size--;
			return data;
		}
	}

	/**
	 *
	 * Descripción: Remueve por la posición y devuelve el dato
	 * 
	 * @param index se refiere a la posición en la que quieres remover el dato
	 * @param
	 * @return Retorna lo que elimina.
	 */
	public E removeByPositionValue(int index) {
		if (head == null || index < 0 || index >= size) {
			System.out.println("Lista vacía o posición equivocada");
			return null;
		}

		Node<E> actual = head;
		Node<E> anterior = null;
		int contador = 0;

		while (contador < index && actual != null) {
			contador++;
			anterior = actual;
			actual = actual.getSiguiente();
		}

		if (contador == index) {
			if (anterior != null) {
				anterior.setSiguiente(actual.getSiguiente());
			} else {
				head = actual.getSiguiente();
			}
			size--;
			return actual.getDatos();
		} else {
			System.out.println("No se encontró el elemento en la posición especificada");
			return null;
		}
	}

	// Remueve por la posición
	public void removeByPosition(int index) {
		if (head == null && index < 0 || size < index) {
			System.out.println("Lista vacía o posición equivocada");
			return;
		}

		Node<E> actual = head;
		Node<E> anterior = null;
		int contador = 0;
		while (contador < index && actual.getSiguiente() != null) {
			contador++;
			anterior = actual;
			actual = actual.getSiguiente();
		}
		if (contador == index) {
			anterior.setSiguiente(actual.getSiguiente());
		} else {
			head = actual.getSiguiente();
		}
		size--;
	}

	public E get(int position) {
		if (head == null || position < 0 || position >= size) {
			return null; // La lista está vacía o la posición está fuera de rango.
		}

		Node<E> current = head;
		int index = 0;

		while (index < position) {
			current = current.getSiguiente();
			index++;
		}
		return current.getDatos();
	}

	public E getFirstElement() {
		if (head != null) {
			return head.getDatos();
		} else {
			return null;
		}
	}

	// Implementaciones para resolver parcial semestre anterior
	public E getLastElement() {
		Node<E> nodoFinal = head;
		while (nodoFinal.getSiguiente() != null) {
			nodoFinal = nodoFinal.getSiguiente();
		}
		return nodoFinal.getDatos();
	}

	public void limpiar() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void print() {

		if (this.head == null) {
			System.out.print("[Null]");
			return;
		}

		Node<E> actual = this.head;
		while (actual.getSiguiente() != null) {
			System.out.print("[" + actual.getDatos() + "]" + "->");
			actual = actual.getSiguiente();
		}
		System.out.print("[" + actual.getDatos() + "]");
	}

	public void printReverse() {
		printReverseRecursive(head);
	}

	private void printReverseRecursive(Node<E> node) {
		if (node == null) {
			return;
		}

		System.out.print("[" + node.getDatos() + "]");

		if (node.getSiguiente() != null) {
			System.out.print("->");
		}

		printReverseRecursive(node.getSiguiente());
	}
}
