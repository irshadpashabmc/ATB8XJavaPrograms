package october.ex_20102024;

public class CallChromeFirefox {

    public static void main(String[] args) {

        // call chrome test case
        ChromeTestCase CTC = new ChromeTestCase();
        CTC.openBrowser("Open Chrome");
        CTC.closedBrowser("Close Chrome");
        CTC.takeScreenshot();

        // call firefix test case
        FireFoxTestCase FFTC = new FireFoxTestCase();
        FFTC.openBrowser("Open FireFox");
        FFTC.closedBrowser("Close FireFox");
        FFTC.takeScreenshot();

        // call abstract methods

        BaseClass BC = new BaseClass();
        BC.takeScreenshot();

    }
}
