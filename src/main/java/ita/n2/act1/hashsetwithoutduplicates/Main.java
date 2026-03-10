package ita.n2.act1.hashsetwithoutduplicates;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurantHashSet = new HashSet<>();
        restaurantHashSet.add(new Restaurant("rest1", 123));
        restaurantHashSet.add(new Restaurant("rest2", 1231));
        //Exact duplicates are ignored
        restaurantHashSet.add(new Restaurant("rest2", 1231));
        //But not-exact duplicates are added
        restaurantHashSet.add(new Restaurant("rest2", 3456));

        for (Restaurant restaurant : restaurantHashSet) {
            System.out.println("Name: " + restaurant.getName() + ", Rating: " + restaurant.getRating());
        }
    }
}
