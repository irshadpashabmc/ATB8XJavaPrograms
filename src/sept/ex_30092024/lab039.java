package sept.ex_30092024;

public class lab039 {

    public static void main(String[] args) {

        String Str = "ABCDE";
        int Length = Str.length();
        for (int i=Length-1;i>=0;i--) {

            System.out.println("Character: " + Str.charAt(i) + ", Position: " + i);
            System.out.print(Str.charAt(i) );
        }

    }
}
