package selfeducation;

import java.io.*;

public class DraftConditionsAndCycles {
    public static int min(int... numbers) {
        if (numbers.length == 0)
            throw new IllegalArgumentException("Нет чисел!");
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] > numbers[j]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
        return numbers[0];
    }

    //2) Ввести с клавиатуры четыре числа, и вывести максимальное из них. Сравнивать до тех пор, пока ввод не будет равен "0"
    public static void maximumFromFourthCycle() throws IOException {
        for (int i = 0; i < 3; i++) {
            Reader r = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(r);
            System.out.print("Enter 4 numbers: ");
            int[] thunder = new int[4];
            for (int j = 0; j < thunder.length; j++) {
                thunder[j] = Integer.parseInt(reader.readLine());
                if (thunder[0] == 0) break;
            }
            int max = 0;
            for (int k = 0; k < thunder.length; k++) {
                if (max < thunder[k]) max = thunder[k];
            }
            System.out.println("Maximum is: " + max);
        }
    }

    //3) Ввести с клавиатуры три числа, и вывести минимум.
    public static void threeNumbersMin1() throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Enter four numbers: ");
        int[] descArray = new int[3];
        for (int i = 0; i < descArray.length; i++) {
            descArray[i] = Integer.parseInt(reader.readLine());
        }
        int min = descArray[0];
        for (int i = 0; i < descArray.length; i++) {
            if (descArray[i] < min) min = descArray[i];
        }
        System.out.println("Minimum is: " + min);
    }

    public static void nameAgeDraft() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String m = reader.readLine();
        int m1 = Integer.parseInt(m);
        if (m1 < 18) System.out.println("Подрасти еще");
    }

    //5 Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public static void youAreTooYang1() throws IOException {
        System.out.println("What's your name? ");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
        String name = bufferedReader1.readLine();
        System.out.println("Hi, " + name);
        System.out.println("How old are you? ");
        Reader s = new InputStreamReader(System.in);
        BufferedReader reader2 = new BufferedReader(s);
        String age = reader2.readLine();
        int numAge = Integer.parseInt(age);
        //int numAge = Integer.parseInt(String.valueOf(reader2));
        if (numAge < 18) System.out.println(name + ", подрасти еще");
    }

    public static void tenS1() throws UnsupportedEncodingException, IOException {
        int i = 0;
        while (i < 10) {
            i++;
            int j = 0;
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
        }
    }

    //12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
    //Example output:
    //1 2 3 4  5  6  7  8  9  10
    //2 4 6 8  10 12 14 16 18 20
    //3 6 9 12 15 18 21 24 27 30
    public static void multiplicationTable1() throws Exception {
        int i = 1, n = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            while (n <= 9) {
                n++;
                System.out.print(i * n + " ");
            }
            i++;
            n = 1;
            System.out.println("");
        }
    }
}
