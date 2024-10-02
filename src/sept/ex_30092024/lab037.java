package sept.ex_30092024;

import java.util.Scanner;

public class lab037 {
    public static void main(String[] args) {

        String question = "What is the name of the computer ?";
        String a = "Machine";
        String b = "Not a machine";
        String c = "Telephone";
        String d = "Television";
        String e = "Please type the correct Answer below";
        String str;

        Scanner SC = new Scanner(System.in);

        System.out.println(question);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        str = SC.nextLine();
        // System.out.println(str);

        if (a.equalsIgnoreCase(str)) {
            System.out.println("a is the correct Answer");
                System.out.println("Congrats! move to the next question");
        }else if (b.equals(str)){
            System.out.println("b is the Wrong Answer");
            System.out.println("Congrats! move to the next question");
        } else if (c.equals(str)){
            System.out.println("c is the Wrong Answer");
                System.out.println("Ohh! Better luck next time");
        }else if (d.equals(str)){
            System.out.println("d is the Wrong Answer");
                System.out.println("Ohh! Better luck next time");
        }else {
            System.out.println("no options has been entered");
                System.out.println("Ohh! Better luck next time");
        }

    }
}
