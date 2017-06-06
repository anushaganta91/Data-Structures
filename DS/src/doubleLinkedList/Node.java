package doubleLinkedList;

public class Node {
	Object value;
	Node next;
	Node previous;

	public Node(Object value, Node previous, Node next) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

}
