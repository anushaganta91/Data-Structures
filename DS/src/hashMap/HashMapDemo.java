package hashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String> hm = new HashMap<String>(10);
		hm.put(101, "Anusha");
		hm.put(102, "Harish");
		hm.put(103, "Praneeth");
		System.out.println(hm.get(103));
	}

}
