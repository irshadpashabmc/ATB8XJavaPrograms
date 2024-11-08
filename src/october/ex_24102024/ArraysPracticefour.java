package october.ex_24102024;

import java.util.Arrays;

public class ArraysPracticefour {

    public static void main(String[] args) {

        char[] Char = new char[5];
        String[] Str = new String[5];

        Str[0]= "a";
        Str[1]= "b";
        Str[2]= "c";
        Str[3]= "d";
        Str[4]= "e";

        Char[0] = Str[0].charAt(0);
        Char[1] = Str[1].charAt(0);
        Char[2] = Str[2].charAt(0);
        Char[3] = Str[3].charAt(0);
        Char[4] = Str[4].charAt(0);
        System.out.println(Char);
        System.out.println(Arrays.toString(Str));

    }
}
