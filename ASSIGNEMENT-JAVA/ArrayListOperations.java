/*
 * 2.3 Write a Java program to create an ArrayList and apply the following operation:

a. Add and display the following elements in the ArrayList object: Google, Apple, Amazon, Facebook, Twitter, and Oracle.
b. Update the 3rd element in the above list by “Microsoft.”
c. Remove the last element from the list of objects.
d. Check whether an element is available on the list  (10 Marks)
 * 
 */

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();

        // a. Add elements to the ArrayList
        companies.add("Google");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Facebook");
        companies.add("Twitter");
        companies.add("Oracle");

        // Display the ArrayList
        System.out.println("Initial ArrayList: " + companies);

        // b. Update the 3rd element (index 2 as index starts at 0)
        companies.set(2, "Microsoft");
        System.out.println("ArrayList after updating the third element: " + companies);

        // c. Remove the last element
        companies.remove(companies.size() - 1);
        System.out.println("ArrayList after removing the last element: " + companies);

        // d. Check whether an element is available on the list
        String searchElement = "Apple";
        if (companies.contains(searchElement)) {
            System.out.println(searchElement + " is found in the list.");
        } else {
            System.out.println(searchElement + " is not found in the list.");
        }
    }
}
