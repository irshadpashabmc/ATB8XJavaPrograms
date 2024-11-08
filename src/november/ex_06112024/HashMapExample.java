package november.ex_06112024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Roadno",12);
        hm.put("StudentID",25);
        hm.put("Adharno",5678);
        hm.put(null,12);
        hm.put("Check",null);

        System.out.println(hm);
        System.out.println(hm.get("check"));
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.size());
        System.out.println(hm.containsKey(null));

        for(Map.Entry<String,Integer> item: hm.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }


    }
    }

