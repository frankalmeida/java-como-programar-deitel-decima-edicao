package com.deitel.capitulo20;

public class EmptyStackException extends RuntimeException {
    // construtor sem argumento
    public EmptyStackException() {
	this("Stack is empty");
    }

    // construtor de um argumento
    public EmptyStackException(String message) {
	super(message);
    }
}
