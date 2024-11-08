package october.ex_18102024;

public class Overloading {

    void load() {
        System.out.println("Overloading method");
    }

    void load(int a) {
        System.out.println(a);
    }

    String load(String a) {

        return "load";
    }

}
