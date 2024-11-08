package october.ex_10102024;


public class PublicFather {

    int fathernumber;
    String fatherString;

    public void fathermethod1() {

        System.out.println("the public father1 non return method");

    }

    public static void fathermethod2() {

        System.out.println("the public father2 non return static method");

    }

    public final void fathermethod3() {

        System.out.println("the public father3 non return final method");

    }

    public int fathermethod4(int a, int b) {

        System.out.println("the public father4 with return static method");

        return a + b;
    }

    public static String fathermethod5() {

        System.out.println("the public father5 return static method");

        return "Fathermethod5";

    }

    public final char fathermethod6() {

        System.out.println("the public father6 return final method \n");

        return 'f';

    }

    protected final void fathermethod7() {

    }

    protected final int fathermethod8() {

        return 0;
    }

    public static void main(String[] args) {





    }



}

