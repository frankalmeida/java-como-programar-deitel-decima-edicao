package com.deitel.capitulo21;

public class QueueTest {
    public static void main(String[] args) {
	Queue<Integer> queue = new Queue<>();

	// utiliza o método enqueue
	queue.enqueue(-1);
	queue.print();
	queue.enqueue(0);
	queue.print();
	queue.enqueue(1);
	queue.print();
	queue.enqueue(5);
	queue.print();

	// remove os objetos da fila
	try {
	    int removedItem;

	    while (true) {
		removedItem = queue.dequeue(); // utiliza método dequeue
		System.out.printf("%n%d dequeued%n", removedItem);
		queue.print();
	    }
	} catch (EmptyListException emptyListException) {
	    emptyListException.printStackTrace();
	}
    }
}
