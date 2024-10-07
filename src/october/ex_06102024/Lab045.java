package october.ex_06102024;

public class Lab045 {

    public static void main(String[] args) {
String a = "aaaaa";

String b = "bbbbb";

String c = a.concat(b);
String d = c.concat(a);
String e = String.valueOf(a.compareTo(b));
String f = String.valueOf(a.equals(b));
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);


    }
}
