package com.deitel.capitulo15;

public enum MenuOption {
    ZERO_BALANCE(1), CREDIT_BALANCE(2), DEBIT_BALANCE(3), END(4);

    private final int value; // opção atual de menu

    // construtor
    private MenuOption(int value) {
	this.value = value;
    }
}
