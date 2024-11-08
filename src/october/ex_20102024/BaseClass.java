package october.ex_20102024;

public class BaseClass extends GrandBaseClass {

    void openBrowser(String Browser) {}
    void closedBrowser(String Browser) {}


    @Override
    void takeScreenshot() {
        System.out.println("Hi this is abstract method implemented" +
                " from base class but created in grand base class");
    }
}
