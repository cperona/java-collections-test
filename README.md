# Java Collection tests

Program to test fundamental concepts of collections in Java, focusing on common classes from the java.util library such as ArrayList, HashSet, HashMap, and ListIterator.

The goal is to strengthen the understanding of how to create, modify, and iterate over these data structures, as well as observe their behavior regarding duplicates, object comparison, and element ordering. Also to practice file reading and writing, along with basic user interaction.

Set up: ``git clone https://github.com/cperona/java-collections-test.git``, use the temurin-25 SDK.

## Level 1

### Exercise 1 — Duplicates (org.example.n1_act1_duplicates package)

Use ArrayList and HashSet to practice adding and modifying elements and to observe how duplicates are handled.

Create a Month class with a name attribute. Add 11 months to an ArrayList, leaving out “August.” Insert it in the correct position and verify the order. Convert the ArrayList into a HashSet to confirm that duplicates are not allowed. Finally, iterate through the collection using both a for loop and an Iterator.

### Exercise 2 — ListIterator (org.example.n1_act2_listiterator package)

Create and fill a List<Integer>. Then create a second list containing the same elements in reverse order. Use a ListIterator to read elements from the first list and insert them into the second.

### Exercise 3 — Capital Game (org.example.n1_act3_capitalgame package)

***IMPORTANT: On the Main class, change the ConsoleApp contructor parameters QUESTIONS_FILE_ROUTE and CLASSIFICATION_FILE_ROUTE to the desired routes.***

Read data from a countries.txt file containing country–capital pairs separated by commas. Store them in a HashMap<String, String>, where the key is the country and the value is the capital.

Ask the user for their name and start a quiz with 10 randomly selected different countries. For each question, display a country and ask the user to enter its capital. Add one point for each correct answer. At the end, display the final score and save the user’s name and score in a file called classificacio.txt.

## Level 2

### Exercise 1 — HashSet Without Exact Duplicates

Create a Restaurant class with two attributes: name (String) and rating (int). Implement equals() and hashCode() so that a HashSet does not allow exact duplicates (same name and same rating).

Note: Restaurants may share the same name if their ratings are different, but exact duplicates are not allowed.

### Exercise 2 — Multiple Sorting

Using the previous Restaurant class, implement sorting so that objects are ordered alphabetically by name and, if names are the same, by rating in descending order.

I used Comparable to do this.

Example order:
Restaurant A — 9
Restaurant A — 7
Restaurant B — 8

## Level 3

### Exercise 1 — People Manager with Sorting

Create an application that reads a CSV file containing three fields per record: name, surname, and DNI (ID number). The program must allow sorting the people by name, surname, or DNI, in ascending or descending order.

The Person class has three attributes: name, surname, ID

The main menu should include options to:

```
1. Add a person

2. Show people sorted by name (A–Z)

3. Show people sorted by name (Z–A)

4. Show people sorted by surname (A–Z)

5. Show people sorted by surname (Z–A)

6. Show people sorted by DNI (ascending)

7. Show people sorted by DNI (descending)

0. Exit
```

The program should display the list in a formatted table showing name, surname, and DNI.

#ITA.S1.03
