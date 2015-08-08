package kamp.spring;

public class GenericsKullanimi {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Double[] arr2 = { 1.1, 1.2, 1.3 };
		String[] arr3 = { "javase", "javaee", "spring" };

		printArray(arr1);
		printArray(arr2);
		printArray(arr3);

	}

	public static <T> void printArray(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

}
