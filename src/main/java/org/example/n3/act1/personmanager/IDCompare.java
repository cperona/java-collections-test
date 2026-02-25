package org.example.n3.act1.personmanager;

import java.util.Comparator;

public class IDCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getID().compareTo(o2.getID());
    }
}
