package ru.cadmy.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cadmy on 05.12.2018.
 */
public class mapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(1, 1);
        testMap.put(2, 1);
        testMap.put(3, 1);
        testMap.put(1, 2);
        testMap.size();
       // testMap.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

        for (int i = 0; i < 1000; i++) {
            System.out.println("map.put(" + i +", 1);");
        }
    }
}
