public class StringManipulator {

    // Trim both input strings and then concatenate them. Return the new string
    // use the trim method of the String class
    public String trimAndConcat(String first, String second) {
        return (first.trim()).concat(second.trim());
    }


    // Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. 
    // use the indexOf method of the String class
    public int getIndexOrNull(String str, char aLetter) {
        int getIndexOrNull = str.indexOf(aLetter);
        return (getIndexOrNull);   
    }



    // Get the index of the start of the substring and return either the index or null. 
    // use the indexOf method of the String class.
    public Integer getIndexOrNull(String str1, String str2) {
        Integer getIndexOrNull = str1.indexOf(str2);
        return (getIndexOrNull);
    }



    //  Get a substring using a starting and ending index, and concatenate that with the second string input to our method. 
    // use the substring method of the String class.
    public String concatSubstring(String firstWord, int startIndex, int endIndex, String secondWord) {
        String concatSubstring = ((firstWord.substring(startIndex, endIndex)).concat(secondWord));
        return (concatSubstring);
    }
    

}



Find Max
Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.