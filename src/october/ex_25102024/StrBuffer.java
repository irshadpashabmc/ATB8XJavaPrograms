package october.ex_25102024;

public class StrBuffer {
    public static void main(String[] args) {

        String STR = "HelloWorld";

        StringBuffer SB = new StringBuffer(STR);
        String STR1 = String.valueOf(SB.append("Irshad"));
        System.out.println(STR1);

        String STR2 = "Hellobhayya";

        StringBuilder SBI = new StringBuilder(STR2);

        String SBI1 = String.valueOf(SBI.reverse());
        System.out.println(SBI1);
        SBI.deleteCharAt(9);
        System.out.println(SBI);

    }
}
