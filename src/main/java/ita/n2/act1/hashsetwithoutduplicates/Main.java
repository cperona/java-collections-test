package ita.n2.act1.hashsetwithoutduplicates;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("rest1", 123);
        Restaurant restaurant2 = new Restaurant("rest2", 1231);
        System.out.println(restaurant1.equals(restaurant2));
    }
}
