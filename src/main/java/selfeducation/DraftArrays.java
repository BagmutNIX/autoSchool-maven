package selfeducation;

import java.util.ArrayList;

public class DraftArrays {
    public static void example() {
        int[] numbers = new int[21];
        //int output = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            //output = numbers[i];
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList catNames = new ArrayList();
        catNames.add("Васька");
        catNames.set(0, "Petka");
        //catNames.set()
        System.out.println(catNames);

    }

/*    public void main(String[] args) {
        String[] letters = new String[26];
        for (int i = 0; i < 26; i++) {
            letters[i] =  (char)('a' + i) + "";
        }
        System.out.println(Arrays.
    }*/
}
