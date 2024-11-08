package october.ex_17102024;

public class ChildEncapsulation {

    public static void main(String[] args) {

        FatherEncapsulation FE = new FatherEncapsulation("Father Home");

        FE.sHome("Setting Home variable");
        System.out.println(FE.gHome());
         FE.home = "set value from child";

    }

}
