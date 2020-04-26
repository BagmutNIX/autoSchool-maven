package com.exceptions_and_logging;

public class TryException {
    public static void linesFrom108() throws Exception {

       // throw new java.lang.Exception();

        for (int i = 0; i < 10; i++) {
            System.out.print("8 ");
        }
        int zero = 5/0;
        Thread.sleep(3000);
        for (int i = 0; i < 10; i++) {
            System.out.println("8");
        }
    }
}
