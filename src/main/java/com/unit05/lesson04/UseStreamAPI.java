package com.unit05.lesson04;
//package org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UseStreamAPI {
    /* 5.4.1
    1. Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно).
    2. Добавьте вручную несколько пустых элементов ""
    3. С помощью stream() выведите на консоль:
        длинну каждого из элементов списка.
        не пустые элементы списка не содержащие символ d
        элементы списка в алфавитном порядке. */

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Task 5.4.1:");

        List<String> randomString = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            randomString.add(getString());
        }
        randomString.add("");
        randomString.add("");

        System.out.println();
        System.out.println("List of random strings:");
        randomString.forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Lengths:");

        /*for (int i = 0; i < randomString.size(); i++) {
            System.out.println(randomString.get(i).length());
        }*/
        //System.out.println(() -> randomString.forEach(String::length));
        randomString.forEach(s -> System.out.println(s.length()));

        System.out.println("===========================================");
        System.out.println("Words that are not empty and not contain 'd' letter:");
        randomString.stream().filter((string) -> !string.isEmpty() && !string.contains("d"))
                .forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Sorted list:");
        randomString.stream()
                .sorted()
                .forEach(System.out::println);
    }

    //method from internet:
    public static String getString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(random.nextInt(20))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
