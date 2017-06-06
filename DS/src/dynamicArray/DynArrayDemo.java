package dynamicArray;

public class DynArrayDemo {

	public static void main(String[] args) {
		DynamicArray<Integer> dr = new DynamicArray<Integer>();
		dr.put(1);
		System.out.println("Array size:" + dr.getSize());
		dr.put(2);
		System.out.println("Array size:" + dr.getSize());
		dr.put(3);
		System.out.println("Array size:" + dr.getSize());
		dr.put(4);
		System.out.println("Array size:" + dr.getSize());
		dr.put(5);
		System.out.println("Array size:" + dr.getSize());
		dr.put(6);
		System.out.println("Array size:" + dr.getSize());
		dr.put(7);
		System.out.println("Array size:" + dr.getSize());
		for (int i = 0; i < dr.getSize() - 1; i++) {
			System.out.println(dr.get(i));
		}
	}

}
