package november.ex_05112024;

import java.util.*;

public class JavCollections {

    public static void main(String[] args) {

       List list = List.of("table","apple","ball","coconut","bread","jam",1);

        /*System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf("1"));
        System.out.println(list.lastIndexOf("2"));
*/
        List MyList = new ArrayList();

        MyList.add("dog");
        MyList.add("boy");
        MyList.add("cat");
        MyList.add("Apple");
        MyList.add("elephant");
        MyList.add(1);
        MyList.add("fan");
        MyList.add("ginger");
        MyList.add(2);
        MyList.add(3);
        MyList.add('A');
        MyList.add('B');
        MyList.add('C');
        MyList.add(12.25);

        System.out.println(MyList);
        System.out.println(MyList.size());
        System.out.println(MyList.get(0));
        System.out.println(MyList.get(3));
        System.out.println(MyList.indexOf("Apple"));
        System.out.println(MyList.lastIndexOf(2));
        System.out.println(MyList.contains(1));
        System.out.println(MyList.contains("boy"));
      //  Collections.sort(MyList);
     //   System.out.println(MyList);

        for(Integer i = 0; i<MyList.size();i++ ) {

            System.out.println(MyList.get(i));

        }

        System.out.println("---------");

for(Object e : MyList) {

    System.out.println(e);
}

        System.out.println("---------");

        List MyList1 = new ArrayList();

        MyList1.add(5);
        MyList1.add(3);
        MyList1.add(4);
        MyList1.add(2);
        MyList1.add(1);

        Collections.sort(MyList1);
        System.out.println(MyList1);
        Collections.sort(MyList1,Collections.reverseOrder());
        System.out.println(MyList1);


        List MyList2 = new ArrayList();

        MyList2.add("coconut");
        MyList2.add("dog");
        MyList2.add("apple");
        MyList2.add("giraffe");
        MyList2.add("ball");

        Iterator ITR = MyList2.iterator();

        while(ITR.hasNext()) {
            System.out.println( ITR.next());
        }

        Collections.sort(MyList2);
        System.out.println(MyList2);
    //    Collections.sort(MyList2,Collections.reverseOrder());
     //   System.out.println(MyList2);

          Collections.reverse(MyList2);
        System.out.println(MyList2);

        List MyList3 = new ArrayList();

        MyList3.add("1");
        MyList3.add("3");
        MyList3.add("2");
        MyList3.add("Dog");
        MyList3.add("ball");
        MyList3.add("apple");


        Collections.sort(MyList3);
        System.out.println(MyList3);
        Collections.sort(MyList3,Collections.reverseOrder());
        System.out.println(MyList3);




    }
}
