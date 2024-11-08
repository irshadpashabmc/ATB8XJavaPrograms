package october.ex_10102024;
import static october.ex_10102024.PublicFather.fathermethod2;
import static october.ex_10102024.PublicFather.fathermethod5;


public class Lab048 {

    public static void main(String[] args) {

         // Access Father class

        // using reference data type and reference object with new keyword to call father method

        PublicFather PF =  new PublicFather();

        PF.fathermethod1();
        PF.fathermethod3();
        PF.fathermethod4(10,30);
        PF.fathermethod6();

        // calling Static Methods

        fathermethod2();
        fathermethod5();

        // print the return method 4,5,6

        int Method4 = PF.fathermethod4(10,30);
        System.out.println(Method4);

        System.out.println( fathermethod5());

        char Method6 = PF.fathermethod6();
        System.out.println(Method6);


    }
}
