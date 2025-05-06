package com.deitel.capitulo7;

public class SumArray {
    public static void main(String[] args) {
	int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
	int total = 0;

	for (int element : array) {
	    total += element;
	}

	System.out.printf("Total of array elements: %d%n", total);
    }

}
