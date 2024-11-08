package october.ex_10102024;

public class PublicChild extends PublicFather {

    public void childmethod1() {


        System.out.println("this is non return child method");

    }


    public int childmethod2(int c, int d) {

        System.out.println("this is with return child method");

        return c+d;

    }
}
