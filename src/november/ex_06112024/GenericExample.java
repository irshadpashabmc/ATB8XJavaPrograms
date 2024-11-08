package november.ex_06112024;

public class GenericExample {

    public static <T1,T2,T3,T4> void Test(T1 a,T2 b,T3 c,T4 d) {

        System.out.println(a);
    }
    public static void main(String[] args) {

        Test(20,30,40,50);
        Test("hi","hello","bye","jao");

    }
}
