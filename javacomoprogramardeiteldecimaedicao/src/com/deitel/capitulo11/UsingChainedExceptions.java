package com.deitel.capitulo11;

public class UsingChainedExceptions {
    public static void main(String[] args) {
	try {
	    method1();
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }

    public static void method1() throws Exception {
	try {
	    method2();
	} // fim do try
	catch (Exception exception) // exceção lançada de method2
	{
	    throw new Exception("Exception thrown in method1", exception);
	}
    }

    public static void method2() throws Exception {
	try {
	    method3();
	} catch (Exception exception) // exceção lançada de method3
	{
	    throw new Exception("Exception thrown in method2", exception);
	}
    }

    public static void method3() throws Exception {
	throw new Exception("Exception thrown in method3");
    }
}
