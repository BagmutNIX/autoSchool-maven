package selfeducation;

import java.util.ArrayList;
import java.util.List;

public class FirstOrSecond {
    public static void main(String[]args){

        List<String> one = new ArrayList<>();
        one.add("first");
        List<String> two = new ArrayList<>();
        //two=one;
        two.add("second");
        int i=0;

        System.out.println(one);
    }
}
