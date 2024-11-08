package october.ex_21102024;

public class StaticPractice {

    public void test() {

        System.out.println("this is test method");

    }

    public static void main(String[] args) {

        StaticPractice SP = new StaticPractice();
        SP.test();
        StaticPractice SP1 = new StaticPractice();
        StaticPractice SP2 = new StaticPractice();
        StaticPractice SP3;
        new StaticPractice();
        new StaticPractice();


    }

    {
        System.out.println("This is Instance Initialization block executes when the object is created");
    }

    static {

        System.out.println("This is Static Initialization block executes when the class is defined with reference variable");
    }

}
