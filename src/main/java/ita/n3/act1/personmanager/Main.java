package ita.n3.act1.personmanager;

public class Main {
    public static void main(String[] args) {
        ConsoleApp consoleApp = new ConsoleApp("personfile.csv", ",");
        consoleApp.createNewCSVFileIfItDoesNotExist();
        consoleApp.readFile();
        consoleApp.launchMenu();
    }
}
