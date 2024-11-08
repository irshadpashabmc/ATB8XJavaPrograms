package Test_Package_Oct2024;

import october.ex_10102024.PublicFather;

import static october.ex_10102024.PublicFather.fathermethod2;
import static october.ex_10102024.PublicFather.fathermethod5;

public class PublicTest_OctPrograms01 extends PublicFather{

    public void testpackagemethod() {

        fathermethod7();  // Can access the protected final method

    }


    public static void main(String[] args) {


        PublicFather PF = new PublicFather();

        PF.fathermethod1();
        fathermethod2();
        PF.fathermethod3();
        PF.fathermethod4(40,50);
        fathermethod5();
        PF.fathermethod6();

        System.out.println(PF.fathermethod4(40,50));
        System.out.println(fathermethod5());
        System.out.println(PF.fathermethod6());

        PublicTest_OctPrograms01 PTP = new PublicTest_OctPrograms01();

        PTP.testpackagemethod();
    }
}
