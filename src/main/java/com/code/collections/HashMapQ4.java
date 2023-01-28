package com.code.collections;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class HashMapQ4 {

    public static String getStart(HashMap<String, String> tickt) {
        HashMap<String, String> revMap = new HashMap<>();
        tickt.keySet().forEach(key -> {
            //key->key,value->tickt.get(key)
            revMap.put(tickt.get(key), key);
        });
         for (String key : tickt.keySet()) {
           if(!revMap.containsKey(key)){
               return key;
           }
        }
         return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        
        String start = getStart(tickets);
        
        while(tickets.containsKey(start)){
            System.out.print(start+" => ");
            start = tickets.get(start);
        }
         System.out.println(start);
    }
}
