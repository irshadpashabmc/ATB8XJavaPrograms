package sept.ex_25092024;

public class lab019 {

    public static void main(String[] args) {

       int a = 10;
       int b = 20;

       if ((a>b && b>a) ||(b>a && a<b) ) {

           System.out.println("a is not a big number");
       }
       else
       {
           System.out.println("b is a big number");
       }

    }
}
