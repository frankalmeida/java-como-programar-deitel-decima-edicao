package com.deitel.capitulo11;

public class UsingExceptions {
    public static void main(String[] args) {
	/*
	 * ATENÇÃO: A execução dos metodos abaixo podem retornar as frases em ordens
	 * diferentes do codificado e do que é exibido no livro, no entanto, isso não é
	 * um erro e não siginifica que as funções estão sendo executadas na ordem
	 * errada. Isto acontece porque que as mensagens System.out são bufferizadas, e
	 * cada IDE trata isso de forma diferente, para mais informações pesquise sobre
	 * buffer de mensagens exibidas pelo System.out e System.err
	 */
	try {
	    throwException();
	} catch (Exception exception) {
	    System.err.println("Exception handled in main");
	}

	doesNotThrowException();
    }

    public static void throwException() throws Exception {
	try {
	    System.out.println("Method throwException");
	    throw new Exception();
	} catch (Exception exception) {
	    System.err.println("Exception handled in method throwException");
	    throw exception;
	} finally {
	    System.err.println("Finally executed in throwException");
	}

    }

    public static void doesNotThrowException() {

	try {
	    System.out.println("Method doesNotThrowException");
	} catch (Exception exception) {
	    System.err.println(exception);
	} finally {
	    System.err.println("Finally executed in doesNotThrowException");
	}

	System.out.println("End of method doesNotThrowException");

    }

}
