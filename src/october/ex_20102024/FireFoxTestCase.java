package october.ex_20102024;

public class FireFoxTestCase extends BaseClass  {

    @Override
    void openBrowser(String Browser) {
        System.out.println("Open the Firefox Browser");
    }

    @Override
    void closedBrowser(String Browser) {
        System.out.println("Close the Firefox Browser");
    }
}

