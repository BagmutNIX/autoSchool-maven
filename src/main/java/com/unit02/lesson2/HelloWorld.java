package com.unit02.lesson2;

import java.util.Scanner;


public class HelloWorld {

    /*Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
    Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
    считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.*/

    public static void printHelloName() {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(String.format("Hello %s", name));
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printHelloName();
    }
}

