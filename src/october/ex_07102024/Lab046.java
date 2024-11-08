package october.ex_07102024;

public class Lab046 {
    // Constructor concepts
    int a;
    int b;
    String c;

    Lab046(int a, int b) {
        System.out.println("this is constructor");
        this.a = 10;
        this.b = 20;
        System.out.println(a+b);
    }

    public static void main(String[] args) {

    Lab046 obj = new Lab046(30,40);
     System.out.println(obj.a);
     System.out.println(obj.b);







    }

}
