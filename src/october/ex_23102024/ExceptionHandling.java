package october.ex_23102024;

public class ExceptionHandling {

    public static void main(String[] args) {

        int a = 10;

        try {
             a= 10/0;
            System.out.println(a);
        } catch (ArithmeticException irshad) {
            System.out.println(irshad.getMessage());
        }
        System.out.println("End");

        try {
            String STR = null;
            System.out.println(STR.trim());
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("String End");
        }



        int c = 0;
        String s = null;
        try {
            System.out.println("Start of integer");
            System.out.println("Start of String");
            System.out.println(c / 0);
            System.out.println(s.trim());
        } catch (ArithmeticException | NullPointerException e ) {

            System.out.println(e);
        }

        System.out.println("End of integer");
        System.out.println("End of String");

    }

}
