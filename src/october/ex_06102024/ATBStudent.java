package october.ex_06102024;

public class ATBStudent {

    // Create a Class  ATBStudent and 5 Objects-(A/B)-GitHub

    public static void Student1() {
        System.out.println("Student 1 function without returning any values");
    }

    public static int Student2() {
        int a = 10;
        int b = 20;
        int res = 0;
        System.out.println("Student 2 with returning value:" +res);
        res = (a+b);
        return res;
    }

    public void Student3() {

        System.out.println("Student 3 method");
    }

    void Student4() {
        System.out.println("Student 4 method");
    }

    static void Student5() {

        System.out.println("Student 5 method");
    }

    int Student6() {

        System.out.println("Student 6 method");

        return 0;
    }

    int Student7(int a, int b) {

        int result = 0;

        System.out.println("Student 7 method:" + result);

        result = a + b;
        return result;
    }


    public static void main(String[] args) {

        // Student 1 call
        Student1(); // it is a static method and non-return type no need to invoke an object

        // Student 2 call//return type
        Student2();// it is a return type and static method no need to invoke an object

        // Student 3 call//return type
        // it is a return type and non-static method
        // need to invoke an object

        ATBStudent Student3obj = new ATBStudent();

        Student3obj.Student3();

        // Student 4 call//non-return type/non-static method

        ATBStudent Student4obj = new ATBStudent();

        Student4obj.Student4();

        // Student 5 call//non-return type/static method/ no need to invoke object

        Student5();

        // Student 6 call/return type/non-static

        ATBStudent Student6obj = new ATBStudent();

        Student6obj.Student6();

        // return type with parameters

        ATBStudent Student7obj = new ATBStudent();

        int res =  Student7obj.Student7(10,20);

        System.out.println("Student 7:Printing from the main method:" +res);


    }
}
