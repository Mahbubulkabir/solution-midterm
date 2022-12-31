package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    public static <Connection> void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(9);
        list.add(6);

        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(0, 10);
        System.out.println(list);
        list.iterator();
        System.out.println(list);


        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        int[] array = {3, 1, 2, 0, 8};
        for (int a : array) {
            System.out.println(it.hasNext());
        }
    }

}



