package sept.task_18Sep2024;

public class Task02 {
    public static void main(String[] args) {
        int a = 10;
       // System.out.println( --a + a--  + a--); //26
       System.out.println( --a + a--  + a-- + a++); //33

        int b = 10;
      //  System.out.println( --b + b++ + b--); //28
       System.out.println( --b + b++ + b-- + b++); //37


        int c = 10;
     //   System.out.println( c-- + c-- + c--); //27
        System.out.println( c-- + c-- + c-- + c++); //34
    }
}
