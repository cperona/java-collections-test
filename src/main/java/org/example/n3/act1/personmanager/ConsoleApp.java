package org.example.n3.act1.personmanager;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleApp {
    private final String CSV_FILE_ROUTE;
    private final String SEPARATOR;
    private Persons persons = new Persons();
    private static Scanner sc = new Scanner(System.in);

    public ConsoleApp(String csvFileRoute, String separator) {
        this.CSV_FILE_ROUTE = csvFileRoute;
        this.SEPARATOR = separator;
    }

    public void launchMenu() {
        clearConsole();
        System.out.println("" +
                "+------------------------------------------------------+\n" +
                "|                      PEOPLE MANAGER                  |\n" +
                "+------------------------------------------------------+\n" +
                "The following actions can be made typing a number (0-7): \n" +
                "1. Introduce person.  \n" +
                "2. Show persons sorted by name (A-Z).  \n" +
                "3. Show persons sorted by name (Z-A).  \n" +
                "4. Show persons sorted by surname (A-Z).  \n" +
                "5. Show persons sorted by surname (Z-A).  \n" +
                "6. Show persons sorted by ID (1-9).  \n" +
                "7. Show persons sorted by ID (9-1).  \n" +
                "0. Quit.");

        int option = readInt("Type a number: ");
        launchOption(option);
    }

    public void createNewCSVFileIfItDoesNotExist() {
        //Create the file if it doesn't exist
        File file = new File(CSV_FILE_ROUTE);
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
                if (created) {
                    writeFirstRow();
                    System.out.println("File created at: " + file.getAbsolutePath());
                } else {
                    System.out.println("File already exists or could not be created.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists at: " + file.getAbsolutePath());
        }
    }

    public void readFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.CSV_FILE_ROUTE));){
            //Skip the first line
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(this.SEPARATOR);
                this.persons.addPerson(lineSplit[0], lineSplit[1], lineSplit[2]);
            }
            System.out.println("File successfully read.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Introduce a valid file route");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeFirstRow() {
        try (FileWriter fileWriter = new FileWriter(this.CSV_FILE_ROUTE)){
            fileWriter.write("Name" + "," + "Surname" + "," + "ID");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Error writing first row: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void writePersonToFile(Person person) {
        try (FileWriter fileWriter = new FileWriter(this.CSV_FILE_ROUTE, true)){
            fileWriter.append("\n" + person.getName() + this.SEPARATOR + person.getSurname() + this.SEPARATOR + person.getID());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("File not read: IOException");
        }
    }

    private void launchOption(int option) {
        switch (option) {
            case Option.INTRODUCE_PERSON:
                String personName = readString("Name: ");
                String personSurname = readString("Surname: ");
                String personID = readString("ID: ");
                this.persons.addPerson(personName, personSurname, personID);
                writePersonToFile(new Person(personName, personSurname, personID));
                System.out.println("New person added.");
                launchMenu();
                break;
            case Option.SHOW_PERSONS_SORTED_BY_NAME_ASCENDING:
                this.persons.sortPersonsByNameAscending();
                System.out.println("Person sorted by name (A-Z): ");
                System.out.println(this.persons.toString());
                do {
                    System.out.println("Type 'q' to return: ");
                } while (!sc.next().equals("q"));
                launchMenu();
                break;
            case Option.SHOW_PERSONS_SORTED_BY_NAME_DESCENDING:
                this.persons.sortPersonsByNameDescending();
                System.out.println("Person sorted by name (Z-A): ");
                System.out.println(this.persons.toString());
                do {
                    System.out.println("Type 'q' to return: ");
                } while (!sc.next().equals("q"));
                launchMenu();
                break;
            case Option.SHOW_PERSONS_SORTED_BY_SURNAME_ASCENDING:
                this.persons.sortPersonsBySurnameAscending();
                System.out.println("Person sorted by surname (A-Z): ");
                System.out.println(this.persons.toString());
                do {
                    System.out.println("Type 'q' to return: ");
                } while (sc.next().equals("q"));
                launchMenu();
                break;
            case Option.SHOW_PERSONS_SORTED_BY_SURNAME_DESCENDING:
                this.persons.sortPersonsBySurnameDescending();
                System.out.println("Person sorted by surname (Z-A): ");
                System.out.println(this.persons.toString());
                do {
                    System.out.println("Type 'q' to return: ");
                } while (sc.next().equals("q"));
                launchMenu();
                break;
            case Option.SHOW_PERSONS_SORTED_BY_ID_ASCENDING:
                this.persons.sortPersonsByIDAscending();
                System.out.println("Person sorted by ID (ascending): ");
                System.out.println(this.persons.toString());
                break;
            case Option.SHOW_PERSONS_SORTED_BY_ID_DESCENDING:
                this.persons.sortPersonsByIDDescending();
                System.out.println("Person sorted by ID (descending): ");
                System.out.println(this.persons.toString());
                do {
                    System.out.println("Type 'q' to return: ");
                } while (sc.next().equals("q"));
                launchMenu();
                break;
            case Option.QUIT:
                System.out.println("Closing...");
                break;
        }
    }

    private static int readInt(String message){
        int out = -1;
        try {
            System.out.print(message);
            out = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Format error. Try again.");
            readInt(message);
        }
        return out;
    }

    public static String readString(String message) {
        String out = null;
        try {
            System.out.print(message);
            out = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Format error. Try again");
            readString(message);
        }
        return out;
    }

    private static void clearConsole() {
        System.out.println(System.lineSeparator().repeat(50));
    }
}
