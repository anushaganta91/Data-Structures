package doubleLinkedList;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		System.out.println("Before performing delete action:");
		dll.display();
		dll.delete();
		System.out.println("Before performing delete action:");
		dll.display();
	}

}
