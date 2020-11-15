// public class FizzBuzz {
//     public static void main(String[] args) {
//         int x = 1;
//         if (x%3 == 0 && x%5 == 0) {
//             System.out.println("FizzBuzz");
//         } else if (x%3 == 0) {
//             System.out.println("Fizz");
//         } else if (x%5 == 0) {
//             System.out.println("Buzz");
//         } else {
//             System.out.println(x);
//         }
//     }
// }


public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number%3 ==0 && number%5 == 0) {
            return "FizzBuzz";
        } else if (number%5 == 0){
            return "Buzz";
        } else if(number%3 == 0) {
            return "fizz";
        } else {
            return String.valueOf(number);
        }
    }
}