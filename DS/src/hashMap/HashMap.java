package hashMap;

public class HashMap<T> {

	Node[] mainArray;
	int size;

	public HashMap(int size) {
		mainArray = new Node[size];
		this.size = size;
		for (int i = 0; i < size; i++) {
			mainArray[i] = new Node();
		}
	}

	public int getHash(int key) {
		int hashIndex;
		hashIndex = key % size;
		return hashIndex;
	}

	public void put(int key, Object value) {
		Node newNode = new Node(key, value);
		int hashIndex = getHash(key);
		Node arrayElement = mainArray[hashIndex];
		newNode.next = arrayElement.next;
		arrayElement.next = newNode;
	}

	@SuppressWarnings("unchecked")
	public T get(int key) {
		T value = null;
		int hashIndex = getHash(key);
		Node arrayElement = mainArray[hashIndex];
		while (arrayElement.next != null) {
			if (arrayElement.next.getKey() == key) {
				value = (T) arrayElement.next.getValue();
				break;
			}
			arrayElement = arrayElement.next;
		}
		return value;
	}

}
