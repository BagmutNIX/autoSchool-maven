package com.exceptions_and_logging;

public class Main {
    public static void main(String[] args) {
        try {
            TryException.linesFrom108();
        } catch (Exception e) {
            System.out.println(e.toString()+"You shall not fall!");
        }
    }
}
