package LinkedLists;

public class SLL {

	// Each SLL object is the header of a
	// singly-linked-list.?
	private Node first;

	public SLL() {
		// Construct an empty SLL.
		this.first = null;
	}

	////////// Inner class //////////
	private static class Node {
		// Each SLL.Node object is a node of a
		// singly-linked-list.
		private Object element;
		private Node next;

		public Node(Object elem, Node next) {
			this.element = elem;
			this.next = next;
		}
	}

	public void printFirstToLast() {
		// Print all elements in this SLL, in first-to-last order.
		SLL.Node curr = this.first;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
		}
	}

	public void deleteFirst() {
		// Delete this SLL�s first node (assuming length > 0).
		this.first = this.first.next;
	}

	public void insert(Object elem, Node pred) {
		// Insert elem at a given point in this SLL, either after the
		// node pred, or before the first node if pred is null.
		Node ins = new Node(elem, null);
		if (pred == null) {
			ins.next = this.first;
			this.first = ins;
		} else {
			ins.next = pred.next;
			pred.next = ins;
		}
	}

	public void insert(Object elem) {
		// Insert elem at head of list
		insert(elem, null);
	}

	public Node search(Object target) {
		// Find which (if any) node of this SLL contains an
		// element equal to target. Return a link to the
		// matching node (or null if there is none).
		Node curr = this.first;
		while (curr != null) {
			if (target.equals(curr.element))
				return curr;
			curr = curr.next;
		}
		return null;

	}

	public void reverse() {
		Node curr = this.first;
		Node pred = null;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = pred;
			pred = curr;
			curr = next;
		}
		first = pred;

	}

}
