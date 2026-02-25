package org.example.n1_act3_capitalgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("" +
                "+ -------------- +\n" +
                "|  CAPITAL GAME  |\n" +
                "+ -------------- +\n" +
                "");

        System.out.println("Enter a username: ");
        try (Scanner sc = new Scanner(System.in)) {
            String username = sc.next();

            ConsoleApp consoleApp = new ConsoleApp(
                    "What is the capital of this country?: ",
                    10,
                    "Country",
                    "Capital",
                    "/var/home/chris/IdeaProjects/java-collections-test/src/main/resources/countries.txt",
                    "/var/home/chris/IdeaProjects/java-collections-test/src/main/resources/classification.txt",
                    username);
            consoleApp.loadFile();
            consoleApp.play();
        } catch (InputMismatchException ex) {
            System.out.println("Format error.");
        }
    }
}
