package org.hw8task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Sea");
        list.add("River");
        list.add("Lake");
        list.add("Ocean");
        list.add("Stream");
        list.add("Basin");
        list.add("Creek");
        list.add("Puddle");
        list.add("Pond");
        list.add("Pool");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(list);
    }
}
