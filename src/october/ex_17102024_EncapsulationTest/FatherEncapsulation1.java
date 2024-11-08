package october.ex_17102024_EncapsulationTest;
import october.ex_17102024.FatherEncapsulation;

public class FatherEncapsulation1 extends FatherEncapsulation {

    public static void main(String[] args) {

        FatherEncapsulation FEN = new FatherEncapsulation("Other Father from out of package");
      FEN.sHome("Other father setting the home");
      System.out.println(FEN.gHome());



    }
}
