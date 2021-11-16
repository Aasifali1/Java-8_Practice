package learn.java.lambda;

public class Wisher {
    public static void wish(Greeting greeting) {
       System.out.println(greeting.greet("Morning"));

        System.out.println(greeting.greet("Evening"));
    }
    // Passing a lambda expression to the wish method
    public static void main(String args[]) {
        wish((msg) -> "Good " +msg+ " Buddy");
    }
}