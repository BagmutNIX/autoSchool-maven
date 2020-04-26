package selfeducation.lesson02;

import java.util.Scanner;

import static java.text.MessageFormat.format;

public class HomeWork02 {
    public static void main(String[] args) {
        /*    1) Написать программу ввода с клавиатуры последовательно 3 чисел. Вывести
    минимальное максимальное и средние значения*/
        System.out.println("Программа определения max, min и middle числа");
        System.out.println("Введите 3 числа:");
        Scanner scanner = new Scanner(System.in);
        //создаём массив:
        double[] array = new double[3];
        //наполняем массив 3мя элементами:
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        //System.out.println(array[2]);

        //определяем максимальное:
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Максимум: " + max);
        //определяем минимальное:
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимум: " + min);
        //определяем среднее:
        double avr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max && array[i] != min)
                System.out.println("Среднее: " + array[i]);
        }

        //способ 2 - через if else:
        System.out.println("Введите 3 разных числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a > b && a >= c && b >= c) System.out.printf(" Максимум: %f,%n Минимум: %f,%n Среднее: %f,%n", a, c, b);
        else if (a >= b && a > c && c >= b)
            System.out.printf(" Максимум: %f,%n Минимум: %f,%n Среднее: %f,%n", a, b, c);
        else if (b >= a && b >= c && a >= c)
            System.out.println(format(" Максимум: %f,%n Минимум: %f,%n Среднее: %f,%n", b, a, c));
        else if (b >= a && b >= c && c >= a)
            System.out.println(format(" Максимум: %f,%n Минимум: %f,%n Среднее: %f,%n", b, c, a));
        else if (c >= a && c >= b && a >= b)
            System.out.println(format(" Максимум: %f,%n, Минимум: %f,%n, Среднее: %f,%n", c, b, a));
        else System.out.printf(" Максимум: %f,%n Минимум: %f,%n Среднее: %f,%n", c, a, b);

        /*    5) Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
    вычислила бы ваш вес на Луне.
         - запросить земной вес с консоли
		 - вывести ваш вес на Земле
		 - вывести ваш вес на Луне*/
        System.out.println("==========================================================");
        System.out.println("Узнай, сколько ты весишь на Луне!");
        System.out.println("Какой твой земной вес?");
        double weight = scanner.nextDouble();
        System.out.printf("Твой вес на Земле %f кг, это значит, что на Луне ты будешь весить %f кг %n", weight, weight * 17 / 100);
        /*        7)
        В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
                Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке

        - прочитать число q
        - прочитать число w

        - вывести число q
        - вывести число w

        - вывести результат целочисленного деления
                - вывести остаток от деления

        Пример:
        q = 21;
        w = 8;
        q/w = 2;
        r = 5 (остаток)

                числа (q и w) передать в программу извне любым способом:
                - как аргументы метода main.
                - предложить пользователю ввести значения
                -* проверить, если не заданы в аргументах в метода main, только в этом случае предложить ввести с консоли*/
        System.out.println("==========================================================");
        System.out.println("А теперь, деление и остаток от деления:");
        System.out.println("Введите 2 целых числа: ");
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.printf(" q = %d,%n w = %d,%n q/w = %d,%n r = %d (остаток)%n", q, w, q / w, q % w);
        /*     11) Проинициализировать одномерный массив произвольными целыми числами
        Вывести массив в виде, например:
		[3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]
        a) используя цикл for
        b) используя цикл while*/
        System.out.println("==========================================================");
        System.out.println("Random filling up array via For cycle: ");
        int[] randomeArray = new int[10];
        System.out.print("[");
        for (int i = 0; i < randomeArray.length; i++) {
            randomeArray[i] = (int) Math.round(Math.random() * 30 - 15);
            System.out.print(randomeArray[i] + ", ");
        }
        System.out.println("]");

        System.out.println("Random filling up array via While cycle: ");
        System.out.print("[");
        int j = 0;
        while (j < randomeArray.length) {
            randomeArray[j] = (int) Math.round(Math.random() * 100 - 5);
            System.out.print(randomeArray[j] + ", ");
            j++;
        }
        System.out.println("]");

        /* 13)    Нарисовать треугольник заданной размерности. Пример для размера 6:
         *
         **
         ***
         ****
         *****
         ******                 */
        System.out.println("==========================================================");
        System.out.println("Рисуем треугольник: ");
        System.out.println("Задайте размерность для равностороннего треугольника: ");
        int size = scanner.nextInt();
        System.out.println("Введите один символ для наполнения треугольника: ");
        String symbol = scanner.next();
        for (int i = 0; i <= size; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(symbol);
            }
            System.out.println(symbol);
        }
    }
}
