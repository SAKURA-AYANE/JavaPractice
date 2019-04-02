package LinkedLists;

//generic SLL
public class SLL2<E> {

	// Each SLL object is the header of a // singly-linked-list.?
	private Node<E> first;

	public SLL2() {
		// Construct an empty SLL.
		this.first = null;
	}

	////////// Inner class //////////
	private static class Node<E> {
		// Each SLL.Node object is a node of a
		// singly-linked-list.
		private E element;
		private Node<E> next;

		public Node(E elem, Node<E> next) {
			this.element = elem;
			this.next = next;
		}
	}

	public void printFirstToLast() {
		// Print all elements in this SLL, in first-to-last order.
		Node<E> curr = this.first;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
		}
	}

	public void deleteFirst() {
		// Delete this SLL’s first node (assuming length > 0).
		this.first = this.first.next;
	}

	public void insert(E elem, Node<E> pred) {
		// Insert elem at a given point in this SLL, either after the
		// node pred, or before the first node if pred is null.
		Node<E> ins = new Node<E>(elem, null);
		if (pred == null) {
			ins.next = this.first;
			this.first = ins;
		} else {
			ins.next = pred.next;
			pred.next = ins;
		}
	}

	public void insert(E elem) {
		// Insert elem at head of list
		insert(elem, null);
	}

	public Node<E> search(Object target) {
		// Find which (if any) node of this SLL contains an
		// element equal to target. Return a link to the
		// matching node (or null if there is none).
		Node<E> curr = this.first;
		while (curr != null) {
			if (target.equals(curr.element))
				return curr;
			curr = curr.next;
		}
		return null;

	}

}
