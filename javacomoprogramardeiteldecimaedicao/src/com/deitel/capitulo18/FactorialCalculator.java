package com.deitel.capitulo18;

public class FactorialCalculator {
    public static long factorial(long number) {
	if (number <= 1) { // testa caso básico
	    return 1; // casos básicos: 0! = 1 e 1! = 1
	} else { // passo de recursão
	    return number * factorial(number - 1);
	}
    }

    public static void main(String[] args) {
	for (int counter = 0; counter <= 21; counter++) {
	    System.out.printf("%d! = %d%n", counter, factorial(counter));
	}
    }
}
