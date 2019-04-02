package LinkedLists;

public class DLL {
	// Each DLL object is the header of a
	// doubly-linked-list.�
	private Node first, last;

	public DLL() {
		// Construct an empty DLL.
		this.first = null;
		this.last = null;
	}

	// //////// Inner class //////////
	private static class Node {
		// Each DLL.Node object is a node of a
		// doubly-linked-list.
		private Object element;
		private Node pred, next;

		public Node(Object elem, Node pred, Node next) {
			this.element = elem;
			this.pred = pred;
			this.next = next;
		}
	}

	public void printLastToFirst() {
		// Print all elements in this DLL, in last-to-first order.
		Node curr = this.last;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.pred;
		}
	}

	
	
	public void delete(Node del){
		Node next = del.next;
		Node pred = del.pred;
		if(del==first) first = next;
		else{
			pred.next = next;
			if(del==last) last =pred;
			else next.pred = pred;
			}
		}
	
	//delete any node containing this value
	public void delete(Object elem){
		if(first!=null){
			Node p =first;
			while(p!=null){
				if(p.element.equals(elem)){
					this.delete(p);
					p=this.first;
				}
				else p=p.next;
			}
			
		}
		
	}
		
	

	public void insert(Object elem, Node pred) {
		// Insert elem at a given point in this SLL, either after the
		// node pred, or before the first node if pred is null.
		Node ins = new Node(elem, null, null);
		if (first == null && last==null) {//list is empty
			first = ins;
			last = ins;
		} else {
			if (pred==null) {//inserting at head
				ins.next=first;
				first.pred = ins;
				first = ins;
			} else {//inserting after last node
				if (pred==last) {
					ins.pred = last;
					last.next = ins;
					last = ins;
				} else {
					Node next = pred.next;
					ins.pred = pred;
					ins.next = next;
					pred.next = ins;
					next.pred = ins;
				}

			}

		}
	}
	
	public void insert(Object elem) { 
		insert(elem, null);
	}
	
	public void printFirstToLast () {
		// Print all elements in this SLL, in first-to-last order.
		Node curr = this.first;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
			}
		}

}
