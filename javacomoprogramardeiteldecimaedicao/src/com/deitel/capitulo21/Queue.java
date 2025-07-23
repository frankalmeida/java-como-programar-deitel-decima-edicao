package com.deitel.capitulo21;

public class Queue<T> {
    private List<T> queueList;

    // construtor
    public Queue() {
	queueList = new List<T>("queue");
    }

    // adiciona o objeto à fila
    public void enqueue(T object) {
	queueList.insertAtBack(object);
    }

    // remove o objeto da fila
    public T dequeue() throws EmptyListException {
	return queueList.removeFromFront();
    }

    // determina se a fila está vazia
    public boolean isEmpty() {
	return queueList.isEmpty();
    }

    // gera o conteúdo da fila
    public void print() {
	queueList.print();
    }
}
