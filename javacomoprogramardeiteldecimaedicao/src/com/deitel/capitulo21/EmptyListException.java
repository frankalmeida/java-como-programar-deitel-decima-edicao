package com.deitel.capitulo21;

public class EmptyListException extends RuntimeException {
    // construtor
    public EmptyListException() {
	this("List"); // chama outro construtor de EmptyListException
    }

    // construtor
    public EmptyListException(String name) {
	super(name + " is empty"); // chama construtor de superclasse
    }
}
