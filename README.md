# Java Collection tests

In this task, you will work with the fundamental concepts of collections in Java, focusing on common classes from the java.util library such as ArrayList, HashSet, HashMap, and ListIterator.

The goal is to strengthen your understanding of how to create, modify, and iterate over these data structures, as well as observe their behavior regarding duplicates, object comparison, and element ordering. You will also practice file reading and writing, along with basic user interaction.

## Exercise 1 — Duplicates

Use ArrayList and HashSet to practice adding and modifying elements and to observe how duplicates are handled.

Create a Month class with a name attribute. Add 11 months to an ArrayList, leaving out “August.” Insert it in the correct position and verify the order. Convert the ArrayList into a HashSet to confirm that duplicates are not allowed. Finally, iterate through the collection using both a for loop and an Iterator.

## Exercise 2 — ListIterator

Create and fill a List<Integer>. Then create a second list containing the same elements in reverse order. Use a ListIterator to read elements from the first list and insert them into the second.

## Exercise 3 — Capital Game

Read data from a countries.txt file containing country–capital pairs separated by commas. Store them in a HashMap<String, String>, where the key is the country and the value is the capital.

Ask the user for their name and start a quiz with 10 randomly selected different countries. For each question, display a country and ask the user to enter its capital. Add one point for each correct answer. At the end, display the final score and save the user’s name and score in a file called classificacio.txt.
