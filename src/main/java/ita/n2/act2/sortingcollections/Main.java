package ita.n2.act2.sortingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("rest1", 1231);
        Restaurant restaurant2 = new Restaurant("rest2", 99999999);
        Restaurant restaurant3 = new Restaurant("rest", 12);
        Restaurant restaurant4 = new Restaurant("rest", 110);

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);
        restaurantList.add(restaurant3);
        restaurantList.add(restaurant4);

        Collections.sort(restaurantList);
        System.out.println(restaurantList);
    }
}