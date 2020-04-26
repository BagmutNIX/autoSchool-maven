/*
Создать еще один класс Main2 с методом main(String[] args), который при запуске выводит в консоль “Hello, world!”.
        Создать отдельный пакет ‘com.welcome’. В нем создать класс Hello, туда добавить методы:
        setupName(String name) - присваивает внутренней private переменной имя человека,
        welcome() - формирует и выводит в консоль приветствие "Hello, %name%" (имя должно подставляться),
        byeBay() - прощается с выводом в консоль фразы "Bye, %name%"
        В Main2 классе подключить этот пакет, и вначале программы запросить имя человека, присвоить его переменной класса Hello,
        потом поприветствовать его, в конце - попрощаться перед закрытием программы. Между ‘hello’ и ‘bye’ будет ваше “Hello, world!”.
*/
package com.unit02.lesson2;
import com.unit02.lesson2.welcome.Hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main2 {
    //2.2.1 Дополнительное задание:
    private static Hello var1 = new Hello();
    public static void main(String[] args) throws IOException {
        System.out.print("What is your name? ");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String name = reader.readLine();
        var1.setupName(name);
        var1.welcome();
        System.out.println("Hello, world!");
        var1.byeBay();
    }
}
