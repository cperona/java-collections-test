package org.example.act2_listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    static void main() {
        //## Part1: Create and fill a List<Integer>
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        //## Part2: Create a second list and add the same element but on reverse order.
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        //## Part3: Use the ListIterator to read the elements of the first list (list1)
        //and add it onto the second list (list2)
        ListIterator<Integer> listIterator = list1.listIterator();

        while (listIterator.hasNext()) {
            list2.add(listIterator.next());
        }

        //Print list2
        for (Integer i : list2) {
            System.out.println("Integer: " + i);
        }
    }
}
