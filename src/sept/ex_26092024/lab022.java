package sept.ex_26092024;

public class lab022 {

    public static void main(String[] args) {

        for (int i = 1; i<=50; i++) {

            if (i % 2 == 0) {
                System.out.println("Even number ->:" +i);
               continue;
                // break;
            }
                System.out.println("Odd Number ->:" +i);
        }
        System.out.println("Program end ->:");
    }
}
