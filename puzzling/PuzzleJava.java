import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
// import java.util.stream.IntStream;
// import java.io.*; 

public class PuzzleJava {

// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public ArrayList method1(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int total = 0;
  
        for(int i=0; i<array.length; i++) {
            // getting the sum 
            total += array[i];

            // adding to newArray
            if (array[i] > 10){
                newArray.add(array[i]);
            }
        }
        System.out.println("total: " + total);
        return (newArray);
    }

// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
    public ArrayList method2() {

        // empty array to store names longer than 5
        ArrayList<String> names2 = new ArrayList<String>();

        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        System.out.println("1: " + names);

        Collections.shuffle(names);
        System.out.println("2: " + names);

        for(int i=0; i<names.size(); i++){
            // print each name 
            System.out.println(names.get(i));

            if(names.get(i).length() > 5) {
                names2.add(names.get(i));
            }
        }
        return names2;
    }

    public ArrayList method2a(String[] listOfNames) {

        // empty array to store names longer than 5
        ArrayList<String> names2 = new ArrayList<String>();

        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < listOfNames.length; i++) {
            names.add(listOfNames[i]);
        }

        System.out.println("1: " + names);

        Collections.shuffle(names);
        System.out.println("2: " + names);

        for(int i=0; i<names.size(); i++){
            // print each name 
            System.out.println(names.get(i));

            if(names.get(i).length() > 5) {
                names2.add(names.get(i));
            }
        }
        return names2;
    }

//  Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    public ArrayList method3() {
        List<String> allLetters = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.addAll(allLetters);
        System.out.println("in order: " + alphabet);
        
        // shuffle the arrayList alphabet 
        Collections.shuffle(alphabet);
        System.out.println("shuffled: " + alphabet);

        // print last element
        System.out.println("last letter: " + alphabet.get(alphabet.size()-1));

        String first = alphabet.get(0);
        if (first == "a" || first == "e" || first == "i" || first == "o" || first == "u") {
            System.out.println("first letter IS the VOWEL: " + first);
        } else {
            System.out.println("first letter is NOT a vowel: " + first);
        }
        return alphabet;
    }


// Generate and return an array with 10 random numbers between 55-100.
    public int method4() {

        int min = 55;
        int max = 100;

        // just to show the different ways of using random
        // generates int from 0 - 100
        Random rand = new Random();  //instance of the class Random
        int int_random = rand.nextInt(101);
        // generates double within a range 
        double double_random = Math.random() * (max - min + 1) + min;

        // ** generate random int value from 55-100 ********
        int random_int = (int)(Math.random() * (max - min + 1) + min);

        return random_int;
    }

    public ArrayList method4a() {
        // create ArrayList to add numbers to
        ArrayList<Integer> randomArrayList = new ArrayList<Integer>();

        int i = 0;
        while(i<10){
            randomArrayList.add(method4()); // using method4 to generate random integers
            i++;
        }
        return randomArrayList;
    }


// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public void method5() {
        ArrayList m4 = method4a();  // use method4a to create ArrayList

        Collections.sort(m4);   // sort ArrayList 
        System.out.println("ArrayList sorted: " + m4);
        System.out.println("First element: " + m4.get(0));
        System.out.println("Last element: " + m4.get(m4.size()-1));
    }


// Create a random string that is 5 characters long.
    public List method6() {
        ArrayList m3 = method3();
        // using subList() method
        List<String> firstFiveList = m3.subList(0,5);
        return firstFiveList;
    }


    
// Generate an array with 10 random strings that are each 5 characters long
    public ArrayList method7() {

        ArrayList<List> finalArrayList = new ArrayList<List>();

        for (int i=0; i < 10; i++) {
            finalArrayList.add(method6());
        }
        System.out.println(finalArrayList);
        return finalArrayList;
    }



    public void method8() {
     
        ArrayList<List> m7 = method7();
        ArrayList<String> myList = new ArrayList<String>();

        for (int i=0; i<m7.size(); i++) {
            StringBuilder sb = new StringBuilder();
            List set = m7.get(i);
            for (int j=0; j< set.size(); j++){
                sb.append(set.get(j));  
            }
            String s = sb.toString();
            myList.add(s);
        }
        System.out.println(myList); // an ArrayList of 10 strings!

    }

}