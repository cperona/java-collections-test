package org.example.n3.act1.personmanager;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private String ID;

    public Person(String name, String surname, String ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    @Override
    public int compareTo(Person o) {
        //Sort by default in ascending order
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
