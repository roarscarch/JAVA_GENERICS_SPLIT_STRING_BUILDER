package example;

import java.util.Arrays;

public class UnderstandingSplit {
    public static void main(String[] args) {
        String fruits = "         Apple, banana, orange, hello             ";
        String[] fruitArray = fruits.split("//s");

        int arr[]= {1,2,3,4,5};


        // Traverse using enhanced for loop
        for (String fruit : fruitArray) {
            System.out.println(fruit.trim()); // trim() to remove leading and trailing spaces
        }
    }
}
