package org.hw8task4;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        getIntegerList(list, 40);
        System.out.println(list);

        LocalTime before = LocalTime.now();
        Integer minimum = getMinimum(list);
        LocalTime after = LocalTime.now();
        System.out.println("Method getMinimum found minimum is list " + (after.getNano() - before.getNano()) + " nanosec.");
        System.out.println("Minimum " + minimum);

        System.out.println();

        before = LocalTime.now();
        minimum = getMinimumModified(list);
        after = LocalTime.now();
        System.out.println("Method getMinimumModified found minimum is list " + (after.getNano() - before.getNano()) + " nanosec.");
        System.out.println("Minimum " + minimum);
    }

    public static void getIntegerList(List<Integer> list, int capacity) {
        for (int i = 0; i < capacity; i++) {
            list.add(i, (int) (Math.random() * 10_000_000));
        }
    }

    public static Integer getMinimum(List<Integer> list) {
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static Integer getMinimumModified(List<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }
}
