package org.example.n2.act2.sortingcollections;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        return ((Restaurant) o).nom.equals(this.nom) && ((Restaurant) o).puntuacio == this.puntuacio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        //Sort in descending order
        return restaurant.puntuacio - this.puntuacio;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", puntuacio=" + puntuacio +
                '}';
    }
}
