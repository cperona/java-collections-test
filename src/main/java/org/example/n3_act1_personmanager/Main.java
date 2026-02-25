package org.example.n3_act1_personmanager;

public class Main {
    static void main() {
        ConsoleApp consoleApp = new ConsoleApp("personfile.csv", ",");
        consoleApp.createNewCSVFileIfItDoesNotExist();
        consoleApp.readFile();
        consoleApp.launchMenu();
    }
}
