package october.Task02102024;

import java.time.LocalDate;

public class ATBStudent {

    // Create a Class  ATBStudent and 5 Objects-(A/B)-GitHub
     // Example Human Identity

    String Name ;
    String Color;
    String Citizen;
    String Country;
    String City;
    String Address;
    String Occupation = "Automation Tester";
    String Education;
    char Gender; // 'M' or 'F'
    int ID_Proof_Num;
    int age;
    float height;
    float weight;
    LocalDate DOB = LocalDate.of(1986,10,31);

  // Behavior Creating Methods

    void function1() {
        System.out.println("This is function: 1");
    }

    void function2(int a, int b) {
        System.out.println("This is function: 2:" +(a+b));
    }

    int function3() {
        int a = 10;
        int b = 20;
        System.out.println("This is function: 3");
        int res = a+b;
        return res;
    }

    int function4(int a, int b) {
       int add =0;
        System.out.println("This is function: 4");
        add = a+b;

        return add;
    }

    public static int function5(int a, int b) {
        int mul =0;
        System.out.println("This is function: 5");
        mul = a*b;

        return mul;
    }

     public static void function6(int a, int b) {

        System.out.println("This is function: 6:"+(a+b));
    }

    public static void function7() {

        System.out.println("This is function: 7");
    }

    public static void main(String[] args) {

        // Calling data members by creating objects

        ATBStudent DateofBirth = new ATBStudent();
        LocalDate Birth =  DateofBirth.DOB; // calling class data members
        System.out.println("Date of Birth is:" +Birth);

        ATBStudent OCC = new ATBStudent();
        String Occupation1 =  OCC.Occupation; // calling class data members
        System.out.println("Occupation is: " +Occupation1);

        // Calling Function: 1 no-return-type without parameters

        ATBStudent Fun1 = new ATBStudent();
        Fun1.function1();

        // Calling Function: 2 no-return-type with parameters

        ATBStudent Fun2 = new ATBStudent();
        Fun2.function2(10,20);

        // Calling Function: 3 return-type without parameters

        ATBStudent Fun3 = new ATBStudent();
       int ResultFun3 =  Fun3.function3();
        System.out.println("Result of Function 3 is:" +ResultFun3);

        // Calling Function: 4 return-type with parameters

        ATBStudent Fun4 = new ATBStudent();
        int ResultFun4 =  Fun4.function4(20,30);
        System.out.println("Result of Function 4 is:" +ResultFun4);


        // Calling Function: 5 Static and return-type with parameters
        // no need to create object direct call the function

        function5(10,20);


        // Calling Function: 6 Static and non-return-type with parameters
        // no need to create object direct call the function

        function6(10,20);

        // Calling Function: 7 Static and non-return-type without parameters
        // no need to create object direct call the function

        function7();
    }

}