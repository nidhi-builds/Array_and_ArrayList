// ArrayFunctions.java

import java.util.*;
import java.util.Arrays;

class ArrayFunctions {

    // Method to display an ArrayList
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    // Method to separate even and odd numbers into different lists
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Even Numbers: ");
        display(even);
        System.out.println("Odd Numbers: ");
        display(odd);
    }

    // Method to find two neighboring numbers with the smallest difference
    public int findSmallestDifferenceIndex(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int minIndex = 0;
        int minDiff = Math.abs(array[1] - array[0]);

        for (int i = 1; i < array.length - 1; i++) {
            int diff = Math.abs(array[i + 1] - array[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }
}