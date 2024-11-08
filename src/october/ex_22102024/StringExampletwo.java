package october.ex_22102024;

public class StringExampletwo {

    public static void main(String[] args) {

        String a = " Hello World";
        String b = "Hi Dear ";
        String c = "1234";

        int d = Integer.parseInt(c);

        // Trim and

        System.out.println("Trim :" +a.trim());
        System.out.println("Lower :" +a.toLowerCase());
        System.out.println("Upper:" +b.toUpperCase());
        System.out.println("Substring1:" +a.substring(7));
        System.out.println("Substring2:" +a.substring(7,12));
        System.out.println("Compare To :" +a.compareTo(b));
        System.out.println("EqualTo :" +a.equals(b));
        System.out.println("concat :" +a.concat(c));
        System.out.println("Relational Equal :" +(a==b));
        System.out.println("Parsing string value into integer:" +d);
        System.out.println("character wise display:" +b.charAt(0));
        System.out.println("length:" +b.length());


                String e= "1212abcd1234";
                String result = e.replaceAll("\\d+$", "ABCD"); // Remove trailing numbers
                System.out.println("Trimmed String: " + result);  // Output: "abcd"

        String result1 = e.replaceAll("\\d", ""); // This removes all digits from the string

        System.out.println("Trimmed String: " + result1);  // Output: "abcd"

        String f = "1234abcd5678";

       String g =  f.replaceAll("\\D+", "");

        System.out.println("Trimmed String: " + g);

        int h = Integer.parseInt(g);
        System.out.println("Trimmed String: " + h);

        System.out.println("contains: " +a.contains("H"));

        StringBuffer j = new StringBuffer("Irshad");
        j.append("pasha");
       // char l =  j.charAt(1);
        System.out.println("contains: " +j);

        StringBuilder k = new StringBuilder("StringBuilder");

        k.reverse();
        System.out.println("contains: " +k);
        System.out.println(a.endsWith("World"));

    }

}
