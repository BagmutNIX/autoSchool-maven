
package com.unit02.lesson3;

import java.util.Scanner;

public class TypeConversion {

    /* 2.3.1 В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
    Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
    public static void restOfDividing() {
        System.out.println("================================================================================");
        System.out.println("Task 2.3.1:");
 /* int q = 21;
    int w = 8;
    int x;*/
        Scanner input = new Scanner(System.in);
        int q, w, x;
        System.out.print("Enter q: ");
        q = input.nextInt();
        System.out.print("Enter w: ");
        w = input.nextInt();
        x = q % w;
        System.out.println("Result is " + x);
    }

    /* 2.3.2 В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
    public static void sumOfDigits() {
        System.out.println("================================================================================");
        System.out.println("Task 2.3.2:");
        Scanner number = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = number.nextInt();
        String str = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int x = Character.getNumericValue(ch);
            sum += x;
        }
        System.out.println("Amount is: " + sum);
        System.out.println("Quantity is: " + str.length());
        //return sum;
/*      int l = 0;
        if (n < 100) {
            if (n < 10) {
                l = 1;
            } else {
                l = 2;
            }
        } else {
            l = 3;
        }
        System.out.println(l);
        return l;*/
    }

    /* 2.3.3 В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую
    число n до ближайшего целого и выводящую результат на экран.*/
    public static void roundNum() {
        System.out.println("================================================================================");
        System.out.println("Task 2.3.3:");
        Scanner numToRound = new Scanner(System.in);
        System.out.print("Enter n: ");
        float n = numToRound.nextFloat();
        System.out.println("Round result is: " + Math.round(n));
    }

    /* 2.3.4 Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
    в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
    Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/
    public static void changeValueOption1() {
        System.out.println("================================================================================");
        System.out.println("Task 2.3.4 Option_1:");
        int a = 0;
        int b = 2;
        int c = 5;
        a = a + b; // or a =+ b;
        b = c - (a - b);
        c = (a - b + c - a) + (b - c + a) + c; // c = c - b + b - c + a + c = a + c;
        System.out.println(String.format("Answer is: a = %d, b = %d, c = %d", a, b, c));
    }

    public static void changeValueOption2(int x, int y, int z) {
        System.out.println("================================================================================");
        System.out.println("Task 2.3.4 Option_2:");
        x += y;
        y = z - (x - y);
        y = z - x * 2 + y;
        z = x + z;
        System.out.println("Новые значения: a = " + x + ", b = " + y + ", c = " + z);
    }
}
