package com.deitel.capitulo8;

public class Employee2 {
    private static int count = 0; // número de Employees criadosÿ
    private String firstName;
    private String lastName;

    public Employee2(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;

	++count; // incrementa contagem estática de empregados
	System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
