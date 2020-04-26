package com.unit02.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


public class Arrays {

    /* 2.5.1 Максимальное среди массива на 20 чисел
    1. В методе initializeArray():
    1.1. Создайте массив на 20 чисел
    1.2. Считайте с консоли 20 чисел и заполните ими массив
    2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
    public static double[] initializeArray() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.5.1:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        double[] numbers = new double[20];
        //ArrayList<int> numbers = new ArrayList<int>();
        System.out.println("Fill up array of 20 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return numbers;
    }

    public static double maxNumInArray(double numbers[]) throws IOException {
        double maximum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) maximum = numbers[i];
        }
        System.out.println("Maximum is: " + maximum);
        return maximum;
    }

    /* 2.5.1 с помощью класса ArrayList:*/
    public static ArrayList<Integer> initializeArrayList() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.5.1 (ArrayList):");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        //int[] numbers = new int[5];
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Fill up array of 20 numbers: ");
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
/*        for (int i = 0; i < numbers.size(); i++) {
            //numbers[i] = i + 1;
            System.out.println("You entered: " + numbers.get(i));
        }*/
        return numbers;
    }

    public static int maxNumInArrayList(ArrayList<Integer> array) throws IOException {
        int maximum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (maximum < array.get(i)) maximum = array.get(i);
        }
        System.out.println("Maximum is: " + maximum);
        return maximum;
    }

    /* 2.5.2 Массив из строчек в обратном порядке
    1. Создать массив на 10 строчек.
    2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
    3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/
    public static void descArrayOrder() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.5.2:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter 8 words: ");
        String[] words = new String[10];
        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            words[i] = s;
        }
        System.out.println("Vise versa order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }

    /* 2.5.3 2 массива
    1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
    public static void measureQuantityOfSymbols() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.5.3:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        java.lang.String[] words = new java.lang.String[10];
        int numbers[] = new int[10];
        System.out.println("Enter strings: ");
        for (int i = 0; i < words.length; i++) {
            java.lang.String s = reader.readLine();
            words[i] = s;
            numbers[i] = words[i].length();
            System.out.println(numbers[i]);
        }
    }

    /* 2.5.4 Массив из чисел в обратном порядке
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Расположить элементы массива в обратном порядке.
    4. Вывести результат на экран, каждое значение выводить с новой строки.    */
    public static int[] viceVersa() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.5.4:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] bingo = new int[10];
        System.out.println("Please fill up the array: ");
        for (int i = 0; i < bingo.length; i++) {
            bingo[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Vise versa order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(bingo[i]);
        }
        return bingo;
    }

    /* 2.5.5 Один большой массив и два маленьких
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
    public static void divideArray() throws IOException {
        System.out.println("================================================================================");
        System.out.println("Task 2.5.5:");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        int[] big = new int[20];
        int[] smallOne = new int[10];
        int[] smallTwo = new int[10];
        System.out.println("Fill up big array: ");
        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(big, 0, smallOne, 0, 10);
        System.arraycopy(big, 10, smallTwo, 0, 10);
        System.out.println("Second small array:");
        for (int i = 0; i < smallTwo.length; i++) {
            System.out.println(smallTwo[i]);
        }
    }
}

