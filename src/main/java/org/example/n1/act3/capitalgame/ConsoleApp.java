package org.example.n1.act3.capitalgame;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ConsoleApp {
    private final String QUESTION;
    private final int NUMBER_OF_QUESTIONS;
    private final String KEYNAME;
    private final String VALUENAME;
    private final String QUESTIONS_FILE_ROUTE;
    private final String CLASSIFICATION_FILE_ROUTE;
    private final String USERNAME;

    private File questionsFile;
    HashMap<String, String> hashMap;
    private int points = 0;

    public ConsoleApp(String QUESTION, int NUMBER_OF_QUESTIONS, String KEYNAME, String VALUENAME, String QUESTIONS_FILE_ROUTE, String CLASSIFICATION_FILE_ROUTE, String USERNAME) {
        this.QUESTION = QUESTION;
        this.NUMBER_OF_QUESTIONS = NUMBER_OF_QUESTIONS;
        this.KEYNAME = KEYNAME;
        this.VALUENAME = VALUENAME;
        this.QUESTIONS_FILE_ROUTE = QUESTIONS_FILE_ROUTE;
        this.CLASSIFICATION_FILE_ROUTE = CLASSIFICATION_FILE_ROUTE;
        this.USERNAME = USERNAME;

        this.questionsFile = new File(QUESTIONS_FILE_ROUTE);
        this.hashMap = new HashMap<>();
    }

    public void play() {
        Iterator<String> it = hashMap.keySet().iterator();

        try (Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
                String questionKey = it.next();

                System.out.println(QUESTION + questionKey);

                String answer = sc.next();

                if (answer.equals(hashMap.get(questionKey))){
                    System.out.println("Correct answer! +1 point");
                    this.points++;
                } else {
                    System.out.println("Incorrect answer.");
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Format error.");
        }

        //Write the result
        writeClassification(this.points);
    }

    public void loadFile() {
        try (Scanner sc = new Scanner(questionsFile)){
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (!line.isEmpty()) {
                    String[] lineSplit = line.split(" ");
                    hashMap.put(lineSplit[0], lineSplit[1]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Questions file route not found. Try again");
        }
    }

    public void writeClassification(int points) {
        try {
            File classificationFile = new File(CLASSIFICATION_FILE_ROUTE);
            if (!classificationFile.canWrite()) {
                classificationFile.createNewFile();
                System.out.println("Classification file created.");
            }
            FileWriter fileWriter = new FileWriter(CLASSIFICATION_FILE_ROUTE, true);
            fileWriter.append(USERNAME + ": " + points + "\n");
            fileWriter.close();
            System.out.println("Points successfully added to Classification file. ");
        } catch (FileNotFoundException ex) {
            System.out.println("Classification file route not found. Try again. ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
