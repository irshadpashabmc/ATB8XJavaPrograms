package october.ex_25102024;

import java.util.*;

public class JavaCollection {

    public static void main(String[] args) {

    ArrayList mylist = new ArrayList();

        mylist.add("hi Irshad");
        mylist.add("Just jared");
        mylist.add("hahaha");
        mylist.add("could be");
        mylist.add("listen please");
        mylist.add("learn a lesson");
        mylist.remove(1);
        System.out.println(mylist);


        List NewList = List.of("apple","Banana","gouva");

        System.out.println(NewList.size());
        System.out.println(NewList.get(2));

        List my = new ArrayList();

        my.add("aloo");
        my.add("tamato");

        System.out.println(my);
        System.out.println(my.size());
        System.out.println(my.get(1));
        System.out.println(my.contains(1));
        System.out.println(my.indexOf(1));
        System.out.println(my.lastIndexOf(1));

        Iterator <String> itr = my.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.hasNext());
        }

        Collection myohmy = new ArrayList();

        List num = new ArrayList();

        num.add(60);
        num.add(189);
        num.add(11);
        num.add(134);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);


    }
}
