package org.example.n2.act2.sortingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        Restaurant restaurant1 = new Restaurant("rest1", 1231);
        Restaurant restaurant2 = new Restaurant("rest2", 99999999);

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);

        Collections.sort(restaurantList);
        System.out.println(restaurantList);
    }
}