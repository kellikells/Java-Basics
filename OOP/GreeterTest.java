public class GreeterTest {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        String greeting = g.greet();
        String greetingWithName = g.greet("Kelli");

        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Kelli")) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}