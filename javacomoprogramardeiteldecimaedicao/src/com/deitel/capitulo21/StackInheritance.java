package com.deitel.capitulo21;

public class StackInheritance<T> extends List<T> {
    // construtor
    public StackInheritance() {
	super("stack");
    }

    // adiciona objeto à pilha
    public void push(T object) {
	insertAtFront(object);
    }

    // remove objeto da pilha
    public T pop() throws EmptyListException {
	return removeFromFront();
    }
}
