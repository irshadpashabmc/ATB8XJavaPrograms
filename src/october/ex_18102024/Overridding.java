package october.ex_18102024;

public class Overridding extends Overloading{

    @Override
    void load() {
      //  System.out.println("Overridded method");

        super.load();
    }

    @Override
    String load(String a) {

        return "Overridded load";
    }
}
