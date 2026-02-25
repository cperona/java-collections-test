package org.example.n3_act1_personmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import de.vandermeer.asciitable.*;
import de.vandermeer.asciithemes.a7.A7_Grids;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;

public class Persons {
    private List<Person> personList = new ArrayList<>();;

    public Persons() {
    }

    @Override
    public String toString() {
        AsciiTable asciiTable = new AsciiTable();
        asciiTable.addRule();
        asciiTable.addRow("Name", "Surname", "ID");
        asciiTable.addRule();
        for (Person p : this.personList) {
            asciiTable.addRow(p.getName(), p.getSurname(), p.getID());
            asciiTable.addRule();
        }

        asciiTable.setTextAlignment(TextAlignment.CENTER);
        asciiTable.getContext().setGrid(A7_Grids.minusBarPlusEquals());

        return asciiTable.render();
    }

    public void addPerson(String name, String surname, String ID) {
        this.personList.add(new Person(name, surname, ID));
    }

    public void sortPersonsByNameAscending() {
        Collections.sort(personList, new NameCompare());
    }

    public void sortPersonsByNameDescending() {
        Collections.sort(personList, new NameCompare().reversed());
    }

    public void sortPersonsBySurnameAscending() {
        Collections.sort(personList, new SurnameCompare());
    }

    public void sortPersonsBySurnameDescending() {
        Collections.sort(personList, new SurnameCompare().reversed());
    }

    public void sortPersonsByIDAscending() {
        Collections.sort(personList, new IDCompare());
    }

    public void sortPersonsByIDDescending() {
        Collections.sort(personList, new IDCompare().reversed());
    }
}
