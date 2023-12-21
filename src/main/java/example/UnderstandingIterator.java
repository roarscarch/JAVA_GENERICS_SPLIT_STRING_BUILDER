package example;

import java.util.ArrayList;
import java.util.Iterator;

public class UnderstandingIterator {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Java");


        // Getting an iterator for the ArrayList
        Iterator<String> iterator = myList.iterator();
       // System.out.println(iterator);
        // Iterating through the elements using hasNext() and next()
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

