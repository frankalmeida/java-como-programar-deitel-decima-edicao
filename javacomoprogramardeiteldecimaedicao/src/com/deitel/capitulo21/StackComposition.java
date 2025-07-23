package com.deitel.capitulo21;

public class StackComposition<T> {
    private List<T> stackList;

    // construtor
    public StackComposition() {
	stackList = new List<T>("stack");
    }

    // adiciona objeto à pilha
    public void push(T object) {
	stackList.insertAtFront(object);
    }

    // remove objeto da pilha
    public T pop() throws EmptyListException {
	return stackList.removeFromFront();
    }

    // determina se a pilha está vazia
    public boolean isEmpty() {
	return stackList.isEmpty();
    }

    // gera saída do conteúdo de pilha
    public void print() {
	stackList.print();
    }
}
