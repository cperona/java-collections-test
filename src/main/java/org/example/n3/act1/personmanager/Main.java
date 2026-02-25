package org.example.n3.act1.personmanager;

public class Main {
    static void main() {
        ConsoleApp consoleApp = new ConsoleApp("personfile.csv", ",");
        consoleApp.createNewCSVFileIfItDoesNotExist();
        consoleApp.readFile();
        consoleApp.launchMenu();
    }
}
