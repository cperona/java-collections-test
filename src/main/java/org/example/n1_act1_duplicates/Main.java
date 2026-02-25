package org.example.n1_act1_duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    static void main(String[] args) {
        //## Part 1 - ArrayList
        ArrayList<Month> monthArrayList = new ArrayList<>();
        Month month1 = new Month("january");
        Month month2 = new Month("february");
        Month month3 = new Month("march");
        Month month4 = new Month("april");
        Month month5 = new Month("may");
        Month month6 = new Month("june");
        Month month7 = new Month("july");
        Month month9 = new Month("september");
        Month month10 = new Month("october");
        Month month11 = new Month("november");
        Month month12 = new Month("december");

        monthArrayList.add(month1);
        monthArrayList.add(month2);
        monthArrayList.add(month3);
        monthArrayList.add(month4);
        monthArrayList.add(month5);
        monthArrayList.add(month6);
        monthArrayList.add(month7);
        monthArrayList.add(month9);
        monthArrayList.add(month10);
        monthArrayList.add(month11);
        monthArrayList.add(month12);

        System.out.println("\nArrayLists are ordered: ");
        for (Month m : monthArrayList) {
            System.out.println(m.getName());
        }

        System.out.println("\nWe can add an object to the ArrayList the position we want: ");
        monthArrayList.add(7, new Month("august"));

        for (Month m : monthArrayList) {
            System.out.println(m.getName());
        }

        //## Part2 - Convert the ArrayList into a HashSet
        //HashSets are unordered and every element is unique: if you add the same object
        //two times, the element is only added one time.
        //We can convert the ArrayList to a HashSet adding it to the constructor.
        HashSet<Month> monthHashSet = new HashSet<>(monthArrayList);

        System.out.println("\nHashSets are unordered and objects added are unique: ");
        for (Month m : monthHashSet) {
            System.out.println(m.getName());;
        }

        //## Part3 - Iterator
        //We can use an Iterator to run through a collection
        System.out.println("\nUse Iterator to run through a collection: ");
        Iterator<Month> it = monthArrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}
