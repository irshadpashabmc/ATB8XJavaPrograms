package sept.ex_24092024;

public class lab009 {
    public static void main(String[] args) {

        int a = +89;  // unary operators
        int b = -3;
        int c = (-a+b);
        c *= 5;
        System.out.println(c);

        System.out.println( 10 == 10); // == Compare true values
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);

        boolean a1 = true;
        System.out.println(!a1);
        System.out.println(!(10>20));
        System.out.println(!!!!(30>90));
        // System.out.println((30>90)!);


    }

}
