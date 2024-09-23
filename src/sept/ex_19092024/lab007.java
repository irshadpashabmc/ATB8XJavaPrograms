package sept.ex_19092024;

public class lab007 {

    public static void main(String[] args) {
      int a = 20;
      int b = 30;
      int c = 40;
      int d ;
        boolean e = (a==b) ;
        boolean f = !(c==c) ;
        boolean g = !(a>b && a>c) ;
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);

     if (a<b) {

         System.out.println("a is a small number");
     } else
     {
         System.out.println("b is a big number");

     }
        if (a<b && a<c) {

            System.out.println("a is a small number");
        } else
        {
            System.out.println("a is big number");

        }


    }
}
