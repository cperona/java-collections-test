package org.example.n2.act1.hashsetwithoutduplicates;

import java.util.Objects;

public class Restaurant {
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
}
