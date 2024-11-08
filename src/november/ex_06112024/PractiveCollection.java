package november.ex_06112024;

import java.util.*;

public class PractiveCollection {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add(String.valueOf(1));
        l.add("cool");

        HashSet HS = new HashSet();

        HS.add("Orange");
        HS.add("PineApple");
        HS.add("Banana");
        HS.add("Apple");
        HS.add(3);
        HS.add(2);
        HS.add(1);
        HS.add(null);
        HS.add(null);
        HS.add(null);
        HS.add("Orange");
        HS.add("Apple");
        HS.add(3);

        System.out.println(HS);
        HS.remove("Orange");
        System.out.println(HS);

//---------------------------------------------

        LinkedHashSet HS1 = new LinkedHashSet();

        HS1.add("Orange");
        HS1.add("PineApple");
        HS1.add("Banana");
        HS1.add("Apple");
        HS1.add(3);
        HS1.add(2);
        HS1.add(1);
        HS1.add(null);
        HS1.add(null);
        HS1.add(null);
        HS1.add("Orange");
        HS1.add("Apple");
        HS1.add(3);

        System.out.println(HS1);
        HS1.remove("Orange");
        System.out.println(HS1);

//--------------------------------------------

        TreeSet HS2 = new TreeSet();

        HS2.add("Orange");
        HS2.add("PineApple");
        HS2.add("Banana");
        HS2.add("Apple");
        HS2.add("3");
        HS2.add("2");
        HS2.add("1");
        HS2.add("Orange");
        HS2.add("Apple");
        HS2.add("3");

        System.out.println(HS2);
        HS2.remove("Orange");
        System.out.println(HS2);

        PriorityQueue PQ = new PriorityQueue();

        PQ.add(1);

    }
}
