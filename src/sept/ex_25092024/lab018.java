package sept.ex_25092024;

public class lab018 {

    public static void main(String[] args) {
         char b = 'd';
        switch (b) {

            case 'a' -> System.out.println("may be wrong");
            case 'b' -> System.out.println("wrong case");
            case 'd' -> System.out.println("correct");
            default -> System.out.println("default case wrong");

        }

        String a = "kashi";

        switch (a) {

            case "sai" -> System.out.println("may be wrong");
            case "vijay" -> System.out.println("wrong case");
            case "kashi" -> System.out.println("correct");
            default -> System.out.println("default case wrong");

        }

    }
}
