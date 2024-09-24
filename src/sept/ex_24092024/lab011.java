package sept.ex_24092024;

public class lab011 {
    public static void main(String[] args) {

        int a = 10;
        int b = --a;
        int c = ++a;
        int d = a++;
        int d1 = a;
        int e = a--;
        int e1 = a;

        int a1 = 10, b1 = 20;
        int max = (a1 > b1) ? a1 : b1;
        System.out.println(max);  // Output: 20

        System.out.println(b); // 9
        System.out.println(c); // 10
        System.out.println(d); // 10
        System.out.println(d1); // 11
        System.out.println(e); // 11
        System.out.println(e1); // 10

        int number = 30;
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binary);


    }
}
