package sept.ex_30092024;

public class lab042 {
    public static void main(String[] args) {

        // positive
        int a = 1;

        do {
            System.out.println(a);
            a++;
        } while (a<=11);

        // negative
        int b = 10;

        do {
            System.out.println(b);
            b--;
        }while (b>=1);

        // nested if

        // if nested condition
        int c = 9;
        int d = 18;

        if (c>5){
            if(c>8) {
                if (d >= 15) {
                    if (d >= 18) {
                        System.out.println("Satisfied 4 conditions");
                    } else {
                        System.out.println("Not satisfied 4");
                    }
                } else {
                    System.out.println("the value is not equal to 15");
                }
            } else {
                    System.out.println("the value is not equal to 8");
                }
        }else {
            System.out.println("the value is not equal to 5");
        }

    }
}
