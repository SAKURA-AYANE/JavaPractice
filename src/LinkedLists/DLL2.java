package LinkedLists;

public class DLL2<E> {
	// Each DLL object is the header of a
	// doubly-linked-list.�
	private DLL2.Node<E> first, last;

	public DLL2() {
		// Construct an empty DLL.
		this.first = null;
		this.last = null;
	}

	// //////// Inner class //////////
	private static class Node<E> {
		// Each DLL.Node object is a node of a
		// doubly-linked-list.
		protected E element;
		protected Node<E> pred,next;

		public Node(E elem, Node<E> pred, Node<E> next) {
			this.element = elem;
			this.pred = pred;
			this.next = next;
		}
	}

	public void printLastToFirst() {
		// Print all elements in this DLL, in last-to-first order.
		DLL2.Node<E> curr = this.last;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.pred;
		}
	}

	
	
	public void delete(DLL2.Node<E> del){
		DLL2.Node<E> next = del.next;
		DLL2.Node<E> pred = del.pred;
		if(del==first) first = next;
		else{
			pred.next = next;
			if(del==last) last =pred;
			else next.pred = pred;
			}
		}
	
	//delete any node containing this value
	public void delete(E elem){
		if(first!=null){
			DLL2.Node<E> p =first;
			while(p!=null){
				if(p.element.equals(elem)){
					this.delete(p);
					p=this.first;
				}
				else p=p.next;
			}
			
		}
		
	}
		
	

	public void insert(E elem, DLL2.Node<E> pred) {
		// Insert elem at a given point in this SLL, either after the
		// node pred, or before the first node if pred is null.
		DLL2.Node<E> ins = new DLL2.Node<E>(elem, null, null);
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
					DLL2.Node<E> next = pred.next;
					ins.pred = pred;
					ins.next = next;
					pred.next = ins;
					next.pred = ins;
				}

			}

		}
	}
	
	public void insert(E elem) { 
		insert(elem, null);
	}
	
	public void printFirstToLast () {
		// Print all elements in this SLL, in first-to-last order.
		DLL2.Node<E> curr = this.first;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
			}
		}

}
