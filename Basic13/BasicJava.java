// public class BasicJava {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i < 50) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BasicJava {

// method that prints all the numbers up to
    public void printUpTo(int someNum) {
        int i = 1;
        while (i <= someNum) {
            System.out.println(i);
            i++;
        }
    }

// method that prints all the odd numbers up to
    public void printOdds(int someNum) {
        int i = 1;
        while (i <= someNum) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

// print sum of the numbers printed so far
    public void printSum(int someNum) {
        int i = 0;
        int totalSum = 0;
        while (i <= someNum) {
            totalSum += i;
            System.out.println("New number: " + i + " Sum: " + totalSum);
            i++;
        }
    }
    
    public void iterateArray(int[] theArray) {
        for(int i : theArray) {
            System.out.println(i);
        }
    }

// Find Max
// takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public int findMax(int[] array) {
        int a = Math.max(array[0], array[1]);

        for(int i = 0; i < array.length; i++) {
            int b = Math.max(array[i], a);
            a = b;
        }
        // System.out.println(a);
        return a;
    }

// Get Average
// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. 
    public int getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // System.out.println(sum/array.length);
        return (sum/array.length);
    }

// Array with Odd Numbers
// Write a method that creates an array 'y' that contains all the odd numbers between 1 to 25. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 25].
    public void createOddArray(int num) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <=num; i+=2) {
            y.add(i);
        }
        System.out.println(y);
    }

// Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 
    public void greaterThanY(int[] array, int y) {
        int count = 0;
        for(int i=0; i < array.length; i++) {
            if (array[i] > y) {
                count+=1;
            }
        }
        System.out.println(count);
    }

// Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public void squareTheValues(int[] x) { 
        int index = 0;
        for (int i : x) {
            x[index] = i*i;
            index++;
        }
        // java utility method toString() from utility class java.util.Arrays
        System.out.print(Arrays.toString(x));
    }

// Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. 
    public void noNegatives(int[] x) {
        for (int i = 0; i< x.length; i++){
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
        System.out.print(Arrays.toString(x));
    }

// Max, Min, and Average
// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum , the minimum value, and the average. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]

    // make a method to get the minimum
    public int findMin(int[] array) {
        int a = Math.min(array[0], array[1]);
        for(int i = 0; i < array.length; i++) {
            int b = Math.min(array[i], a);
            a = b;
        }
        return a;
    }

    public void maxMinAve(int[] x) {
        // use other methods to get desired values:
        int[] finalArray = {findMax(x), findMin(x), getAverage(x)};
        System.out.println(Arrays.toString(finalArray));
    }

// Shifting the Values in the Array
// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.

    public void shiftValues(int[] x) {
 
        // making the x array into ArrayList
        ArrayList<Integer> xList = new ArrayList<Integer>();
        for(int i = 0; i<x.length; i++) {
            xList.add(x[i]);
        }

        System.out.println("before: " + xList);
        xList.remove(0);
        xList.add(0);
        System.out.println("final: " + xList);
    }















}


