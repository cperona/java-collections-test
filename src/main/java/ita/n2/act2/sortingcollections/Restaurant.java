package ita.n2.act2.sortingcollections;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        return ((Restaurant) o).name.equals(this.name) && ((Restaurant) o).rating == this.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        if (restaurant.name.equals(this.name)) {
            //Sort in descending order
            return restaurant.rating - this.rating;
        }
        return this.name.compareTo(restaurant.name);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + name + '\'' +
                ", puntuacio=" + rating +
                '}';
    }
}
