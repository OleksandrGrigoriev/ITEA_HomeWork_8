package org.hw8task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> myMap = new TreeMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        myMap.put("London", "Johnson");
        myMap.put("Barcelona", "Sanchez");
        myMap.put("Amsterdam", "Shildt");
        myMap.put("Kiev", "Petrov");
        myMap.put("Bucharest", "Luchesku");
        myMap.put("New-York", "Smith");
        myMap.put("Roma", "Mancini");
        myMap.put("Athens", "Charisteas");

        System.out.println(myMap);

        String city = br.readLine();

        if (myMap.containsKey(city)) {
            System.out.println(myMap.get(city));
        } else {
            System.out.println("No such key in Map myMap!");
        }

        br.close();
    }
}
