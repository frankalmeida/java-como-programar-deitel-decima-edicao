package com.deitel.capitulo6;

import java.util.Locale;
import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);


		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double result = maximum(number1, number2, number3);

		System.out.println("Maximum is: " + result);
	}

	public static double maximum(double x, double y, double z) {

		double maximumValue = x;

		if (y > maximumValue) {
			maximumValue = y;
		}
		if (z > maximumValue) {
			maximumValue = z;
		}

		// TODO Auto-generated method stub
		return maximumValue;
	}

}
