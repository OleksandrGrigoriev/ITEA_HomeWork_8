package org.hw8task3;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Car");
        list.add("Truck");
        list.add("Moto");
        list.add("Plane");
        list.add("Yacht");

        System.out.println(list);

        doubleValue(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void doubleValue(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i));
            i++;
        }
    }
}
