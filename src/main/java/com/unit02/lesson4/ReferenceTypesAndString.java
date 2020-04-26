package com.unit02.lesson4;

import java.util.Scanner;

public class ReferenceTypesAndString {

    /*2.4.1 Дана строка. Вывести первый, последний и средний (если он есть) символы.
    Напишите программу, которая выводит часть строки до первой встреченной точки,
    включая точку. Также предусмотрите вывод количества пробелов.*/
    public static void showSymbol() {
        System.out.println("================================================================================");
        System.out.println("Task 2.4.1:");
        Scanner text = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String str = text.nextLine();

        //выводим первый и последний символы:
        char first = str.charAt(0);
       // System.out.println("first character: " + first);
        System.out.println("first character: " + str.substring(0, 1));
        System.out.println("last character: " + str.substring(str.length() - 1));

        //выводим средний символ:
        int strLength = str.length();
        int middle = strLength / 2;
        char middleSymbol = str.charAt(middle);
        System.out.println("middle character: " + middleSymbol);
        //return str;
    }

    /*2.4.2 Найти в строке указанную подстроку и заменить ее на новую.
    Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
    public static void changeSubstr() {
        System.out.println("================================================================================");
        System.out.println("Task 2.4.2:");
        Scanner text1 = new Scanner(System.in);
        System.out.println("Enter first sentense: ");
        String str1 = text1.nextLine();

        //Scanner text2 = new Scanner(System.in);
        System.out.println("Enter second sentense");
        String str2 = text1.nextLine();

        //Scanner text3 = new Scanner(System.in);
        System.out.println("Enter substitution: ");
        String str3 = text1.nextLine();

        //String oldSentense = str1;
        //String oldPart = str2;
        String newSentense = str1.replace(str2, str3);
        System.out.println("Updated sentense: " + newSentense);
    }

    /*2.4.3 Вводится строка слов, разделенных пробелами.
    Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
    public static void longestWord() {
        System.out.println("================================================================================");
        System.out.println("Task 2.4.3:");
        Scanner text4 = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String str4 = text4.nextLine();

        String[] str4Parts = str4.split(" ");
        //System.out.println(str4Parts[0]);
/*        for (int i = 0; i < str4Parts.length; i++) {
            System.out.println(str4Parts[i]);
        }*/
        String word = "";
        int max = 0;
        for (int i = 0; i < str4Parts.length; i++) {
            if (max < str4Parts[i].length()) {
                max = str4Parts[i].length();
                word = str4Parts[i];
            }
        }
        System.out.println("The longest world: " + word);
    }
}
