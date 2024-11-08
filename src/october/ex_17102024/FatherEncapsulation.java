package october.ex_17102024;

public class FatherEncapsulation {

 protected String home;

    public FatherEncapsulation(String home) {
        this.home = home;

    }

    public FatherEncapsulation() {

    }
    public String gHome() {
        return home;
    }

    public void sHome(String home) {
        this.home = home;
    }
}
