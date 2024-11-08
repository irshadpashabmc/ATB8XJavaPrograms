package october.ex_24102024;

public class BankOne {

    public static void main(String[] args) throws Exception {

        Bank SBI = new Bank("INR",500);
        Bank ICICI = new Bank("INR",20);
        Bank JP_Morgon = new Bank("USD",350);

        System.out.println(SBI.add(ICICI));
        System.out.println(ICICI.add(SBI));
        System.out.println(SBI.add(JP_Morgon));

    }
}
