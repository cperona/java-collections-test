package ita.n2.act1.hashsetwithoutduplicates;

import java.util.Objects;

public class Restaurant {
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
}
