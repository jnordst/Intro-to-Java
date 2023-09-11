package nordstrom.project.Lesson_01_DataTypes;

import java.util.Collections;
import java.util.List;

public class Lists {
    // In Java, arrays, lists, and ArrayLists are data structures used to store and manage collections of elements.
    // Arrays are fixed-size containers that hold elements of the same type in contiguous memory locations.
    // They provide efficient random access to elements but require a predetermined size at the time of declaration.
    // Lists, on the other hand, are interfaces that represent ordered collections.
    // They allow for dynamic resizing and provide a more flexible alternative to arrays.
    // ArrayLists, specifically, are implementations of the List interface in Java that internally use arrays to store elements.
    // They can dynamically grow and shrink as elements are added or removed.
    // ArrayLists offer convenient methods to add, remove, and access elements by their index.
    // They can store elements of any type and automatically handle resizing and memory management.
    // Lists and ArrayLists are commonly used when the size of a collection may change or when flexibility in adding and removing elements is required.
    // They are widely used in various programming scenarios, including data manipulation, algorithms, and data structures.
    // The most commonly used is the ArrayList, which is a resizable array that can store elements of any type.

    public void ArrayLists()
    {
        // Declare an ArrayList of integers named myInts
        List<Integer> myInts;

        // Declare and initialize an ArrayList of integers named myInts2
        List<Integer> myInts2 = List.of(1, 2, 3, 4, 5);

        // Declare and initialize an ArrayList of integers named myInts3
        List<Integer> myInts3 = List.of(1, 2, 3, 4, 5);

        // Add elements to an ArrayList
        myInts3.add(6); // [1, 2, 3, 4, 5, 6]

        // Remove elements from an ArrayList
        myInts3.remove(0); // [2, 3, 4, 5, 6]

        // Access elements in an ArrayList
        myInts3.get(0); // 2

        // Iterate over an ArrayList
        for (int i = 0; i < myInts3.size(); i++) {
            int element = myInts3.get(i);
            // Do something
        }

        // Iterate over an ArrayList using a for-each loop
        for (int element : myInts3) {
            // Do something
        }

        // Convert an ArrayList to an array
        Integer[] myIntsArray = myInts3.toArray(new Integer[0]);

        // Convert an array to an ArrayList
        List<Integer> myIntsList = List.of(myIntsArray);

        // Convert an ArrayList to a String
        String myIntsString = myInts3.toString(); // "[2, 3, 4, 5, 6]"

        // Convert an ArrayList to a List
        List<Integer> myIntsList3 = List.of(); // [2, 3, 4, 5, 6]

        // ArrayList Functions

        // Remove all elements from an ArrayList
        myInts2.clear(); // []

        // Add an element to the end of an ArrayList
        myInts3.add(6); // [1, 2, 3, 4, 5, 6]

        // Add an element at a specific index
        myInts3.add(0, 0); // [0, 1, 2, 3, 4, 5, 6]

        // Remove an element at a specific index
        myInts3.remove(0); // [1, 2, 3, 4, 5, 6]

        // Remove the first occurrence of an element
        myInts3.remove(Integer.valueOf(1)); // [2, 3, 4, 5, 6]

        // Check if an ArrayList contains an element
        boolean contains = myInts3.contains(1); // false

        // Get the index of the first occurrence of an element
        int index = myInts3.indexOf(4); // 2

        // Get the index of the last occurrence of an element
        index = myInts3.lastIndexOf(3); // 1

        // Check if an ArrayList is empty
        boolean isEmpty = myInts3.isEmpty(); // false

        // Get the size of an ArrayList
        int size = myInts3.size(); // 5

        // Sort an ArrayList
        Collections.sort(myInts3); // [2, 3, 4, 5, 6]

        // Reverse an ArrayList
        Collections.reverse(myInts3); // [6, 5, 4, 3, 2]

        // Shuffle an ArrayList
        Collections.shuffle(myInts3); // [3, 6, 2, 5, 4]

        // Get a subList from an ArrayList
        List<Integer> subList = myInts3.subList(0, 2); // [3, 6]

        // Check if two ArrayLists are equal
        boolean isEqual = myInts3.equals(myInts2); // false

        // Check if two ArrayLists have the same elements
        boolean hasSameElements = myInts3.containsAll(myInts2); // false
    }

    public void Arrays()
    {
        // Declare an array of integers named myInts
        int[] myInts;

        // Declare and initialize an array of integers named myInts2
        int[] myInts2 = { 1, 2, 3, 4, 5 };

        // Declare an array of integers named myInts3 with a size of 5
        int[] myInts3 = new int[5];

        // Assign values to elements in an array
        myInts3[0] = 1;

        // Access elements in an array
        int firstElement = myInts3[0]; // 1
    }

    public void Lists()
    {
        // Declare a list of integers named myIntList
        List<Integer> myIntList;

        // Declare and initialize a list of integers named myIntList2
        List<Integer> myIntList2 = List.of(1, 2, 3, 4, 5);

        // Declare and initialize a list of integers named myIntList3
        List<Integer> myIntList3 = List.of(1, 2, 3, 4, 5);

        // Add elements to a list
        myIntList3.add(6); // [1, 2, 3, 4, 5, 6]

        // Remove elements from a list
        myIntList3.remove(0); // [2, 3, 4, 5, 6]

        // Access elements in a list
        // Indexes start at 0 and end at size - 1
        int firstElement = myIntList3.get(0); // 2

        // Iterate over a list
        for (int i = 0; i < myIntList3.size(); i++) {
            int element = myIntList3.get(i);
            // Do something
        }

        // Iterate over a list using a for-each loop
        for (int element : myIntList3) {
            // Do something
        }
    }
}
