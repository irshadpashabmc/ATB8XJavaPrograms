package october.ex_07102024;

public class Lab047 {

    Lab047() {

        System.out.println("Hi I am constructor");
    }

    void Test() {

        System.out.println("Hi I am Test method");
    }
    public static void main(String[] args) {

    // calling default constructor
        Lab047 Obj = new Lab047();

    // calling Test method
      //  Lab047 Testmethod = new Lab047();
        Obj.Test();

    }
}
