package com.deitel.capitulo20;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> elements; // ArrayList armazena elementos da pilha

    public Stack() {
	this(10);
    }

    public Stack(int capacity) {
	int initCapacity = capacity > 0 ? capacity : 10; // valida
	elements = new ArrayList<T>(initCapacity); // cria a ArrayList
    }

    // insere o elemento na pilha
    public void push(T pushValue) {
	elements.add(pushValue); // insere pushValue na Stackÿ
    }

    public T pop() {
	if (elements.isEmpty()) { // se a pilha estiver vazia
	    throw new EmptyStackException("Stack is empty, cannot pop");
	}

	// remove e retorna o elemento superior da Stack
	return elements.remove(elements.size() - 1);
    }

}
