package com.deitel.capitulo21;

public class StackInheritanceTest {
    public static void main(String[] args) {
	StackInheritance<Integer> stack = new StackInheritance<>();

	// utiliza o método push
	stack.push(-1);
	stack.print();
	stack.push(0);
	stack.print();
	stack.push(1);
	stack.print();
	stack.push(5);
	stack.print();

	// remove itens de pilha
	try {
	    int removedItem;

	    while (true) {
		removedItem = stack.pop(); // utiliza o método pop
		System.out.printf("%n%d popped%n", removedItem);
		stack.print();
	    }
	} catch (EmptyListException emptyListException) {
	    emptyListException.printStackTrace();
	}
    }
}
