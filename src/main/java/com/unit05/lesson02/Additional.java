package com.unit05.lesson02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Additional {
    public static Map<String, String> createMap() {
        System.out.println("");
        System.out.println("");
        System.out.println("================================================================================");

        Map<String, String> mapLastnamesNames = new HashMap<>();
        Random random = new Random();

//        public String getMap () {
//            return mapLastnamesNames;
//                           //        }
        mapLastnamesNames.put("LastNameA", "Sim");
        mapLastnamesNames.put("LastNameB", "Sim");
        mapLastnamesNames.put("LastNameC", "Sim");
        while (mapLastnamesNames.size() < 10) {
            mapLastnamesNames.put("LastName" + random.nextInt(10), "Name" + random.nextInt(7));
        }

        System.out.println("New map with duplicates: ");
        for (Map.Entry<String, String> pair : mapLastnamesNames.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
        return mapLastnamesNames;
    }
}