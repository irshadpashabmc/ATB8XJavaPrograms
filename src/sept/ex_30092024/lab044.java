package sept.ex_30092024;

public class lab044 {

    // Function1 without argument and without return type
    public static void Function1() {

        System.out.println("Function1 without argument values");
    }

    // Function2 with arguments and without return type
    public static void Function2(int a, int b) {

        System.out.println("Function2 with argument values: " +(a+b));
    }

    //Function3 without arguments and with return type
    public static int Function3() {

        System.out.println("Function3 without argument and returning value");
        return 100;
    }

    //Function4 with arguments and with return type
        public static int Function4(int a, int b) {

        System.out.println("Function4 with arguments and returning value");

        return (a+b);
    }

    public static void main(String[] args) {

        // Function 1 call
        Function1();

        // Function 2 call
        Function2(10,20);

        // Function 3 call
        int result = Function3();
        System.out.println(result);

        // Function 4 call
        int result1 = Function4(10,40);
        System.out.println(result1);

    }
}
