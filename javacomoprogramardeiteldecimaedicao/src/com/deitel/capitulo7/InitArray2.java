package com.deitel.capitulo7;

public class InitArray2 {
    public static void main(String[] args) {
	int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
	int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

	System.out.println("Values in array1 by row are");
	outputArray(array1);

	System.out.printf("%nValues in array2 by row are%n");
	outputArray(array2);
    }

    public static void outputArray(int[][] array) {
	for (int[] element : array) {
	    for (int column = 0; column < element.length; column++) {
		System.out.printf("%d ", element[column]);
	    }

	    System.out.println();
	}
    }
}
