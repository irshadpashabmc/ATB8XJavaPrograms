package october.ex_18102024;

public class CallingOverloadingAndOverridding {

    void test() {

        System.out.println();
    }

    public static void main(String[] args) {

        Overridding OR = new Overridding();

        OR.load(10);
        OR.load();


    }
}
