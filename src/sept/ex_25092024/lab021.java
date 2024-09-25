package sept.ex_25092024;

public class lab021 {

    public static void main(String[] args) {

        int a = 25;
        int b = 50;

        if (b > a) {
            System.out.println("b is greater than a ");

            if (b == 50) {
                System.out.println("b is equal to 50 ");

                if (!(b == a)) {
                    System.out.println("b is not equal to a ");
                } else {

                    System.out.println("seems like b is equal to a and condition is failed ");
                }

            } else {
                System.out.println("b is not equal to 50 ");

            }
        } else {
            System.out.println("b is not greater than a ");

        }
    }

    }



