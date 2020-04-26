package selfeducation.lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FindWordsStartWithDOption2 {
    /*    1) Напишите программу, которая:
         - считывает строку
	     - выводит исходную строку
	     - выводит количество и список слов, которые начинаются на букву 'd'*/
    public static void getWordsStartingWithD2() throws IOException {
        System.out.println("=============================================================================");
        System.out.println("The program outputs the number of words that begin with 'd' letter:");
        System.out.println("Enter phrase or random words: ");
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String str = reader.readLine();
        System.out.println("echo: " + str);
        String[] words = str.split(" ");
        List<String> dWordsOpt2 = new ArrayList<>();
        for (String word : words) {
            if (word.charAt(0) == 'd')
                dWordsOpt2.add(word);
        }
        System.out.println("d words count: " + dWordsOpt2.size());
        for (String word : dWordsOpt2) {
            System.out.println(word);
        }
    }
    }
