public class Methods {

    // method create (method declaration/definition)
    /*
     * main is where your program starts. At that moment, no object has been created
     * yet. Since main is static, it can only call other methods that also don't
     * need an object, so print2Table() must be static too.
     */
    // no parameter method
    // void return type methods
    static void print2Table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }

    // parameter method
    static void printSum(int x, int y) { // x,y called parameters
        System.out.println(x + y);
    }

    // non-void return type methods
    static int printMultiplication(int x, int y) {
        return x * y;
    }

    // call by value
    static void solve(int num) {
        System.out.println("inside solve : " + num);
        num = num * 50;
        System.out.println("inside solve : " + num);
    }

    // This variable can be accessed in any method
    static int globVar = 7;

    static void weekdays() {
        int weekdays = 7; // This variable can only be accessed within this method
    }

    // method signature - tells about the method

    // method overloading
    /*
     * Method overloading means defining multiple methods in the same class with the
     * same name but different parameter lists (different signatures).
     */
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Method Call Stack
    /*
     * The call stack is a memory structure that keeps track of which methods are
     * currently running and where to return when each one finishes. It works LIFO
     * (Last In, First Out): the most recently called method finishes first.
     */

    public static void main(String[] args) {
        // public - accessible from anywhere, so the JVM can call it
        // static - belongs to the class, so no object is needed to run it
        // void - returns nothing
        // main - the entry point the JVM looks for
        // String[] args - holds command-line arguments

        // call print2Table method
        print2Table();

        // call printSum method
        printSum(10, 20); // x,y called arguments

        int result = printMultiplication(7, 8);
        System.out.println(result);

        int num = 7;
        System.out.println("inside main : " + num);
        solve(num); // when we send a argument in java function it send a copy(call by value)
        System.out.println("inside main : " + num);

    }

}
