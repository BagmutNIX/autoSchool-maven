package com.unit02.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*2.3.1 В переменных q и w хранятся два натуральных числа. Создайте программу,
        выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
//        TypeConversion.restOfDividing();
//
        /*2.3.2 В переменной n хранится натуральное двузначное число. Создайте программу,
        вычисляющую и выводящую на экран сумму цифр числа n.*/
//        TypeConversion.sumOfDigits();

        /*2.3.3 В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую
        число n до ближайшего целого и выводящую результат на экран.*/
//        TypeConversion.roundNum();

        /*2.3.4 Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
        в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/
//        TypeConversion.changeValueOption1();

        /*2.3.4 - 2й способ, ввод с клавиатуры */
        System.out.println("================================================================================");
        System.out.println("enter xyz");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        System.out.print(x + y + z); // ToDo исправить обозначение
        TypeConversion.changeValueOption2(x, y, z);
    }
}
