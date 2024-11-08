package october.ex_21102024;

public class StaticMethods {

    static void exampleone() {
        System.out.println("This is exampleone");
    }

    static int exampletwo() {

        int one = 10;
        int two = 20;
        return one+two;
    }

    static int exampletwo(int a , int b) {
System.out.println(a+b);
        return a+b;
    }


    public static String examplethree() {

        System.out.println("this is String examplethree");
        return "examplethree";
    }
    public static String examplefour(String c, String d) {

        return c+d;
    }

    {
        System.out.println("IIB");
    }

    static {

        System.out.println("SIB");
    }
    public static void main(String[] args) {


        exampleone();

        exampletwo(2,3);
        System.out.println((exampletwo(2,3)));

        examplethree();

        examplefour("example","Four");
        System.out.println( examplefour("example","Four"));
    }
}


