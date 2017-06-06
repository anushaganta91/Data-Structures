package dynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {
	int size;
	Object[] arr;

	public DynamicArray() {
		size = 0;
		arr = new Object[1];
	}

	public int getSize() {
		return arr.length;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) arr[index];
	}

	public void put(T element) {
		ensureSize(size + 1);
		arr[size++] = element;
	}

	public void ensureSize(int minCap) {
		int currentCap = getSize();
		if (minCap > currentCap) {
			int newCap = currentCap * 2;
			if (newCap < minCap)
				newCap = minCap;
			arr = Arrays.copyOf(arr, newCap);
		}

	}

}
