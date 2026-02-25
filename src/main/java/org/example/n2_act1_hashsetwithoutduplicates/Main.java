package org.example.n2_act1_hashsetwithoutduplicates;

public class Main {
    static void main() {
        Restaurant restaurant1 = new Restaurant("rest1", 123);
        Restaurant restaurant2 = new Restaurant("rest2", 1231);
        System.out.println(restaurant1.equals(restaurant2));
    }
}
