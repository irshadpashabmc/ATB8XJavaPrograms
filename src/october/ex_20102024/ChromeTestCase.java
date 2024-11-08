package october.ex_20102024;

public class ChromeTestCase extends BaseClass {
    @Override
    void openBrowser(String Browser) {
     System.out.println("Open the Chrome Browser");

    }

    @Override
    void closedBrowser(String Browser) {
        System.out.println("Close the Chrome Browser");
    }
}
