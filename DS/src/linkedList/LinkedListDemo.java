package linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Anusha");
		ll.add("Harish");
		ll.add("Praneeth");
		ll.add("Sankeerth");
		ll.add("Disha");
		ll.add("Ramen");
		System.out.println("Before performing delete operation");
		ll.display();
		// ll.delete();
		System.out.println("After performing delete operation");
		ll.display();

	}

}
