public class Conditionals{
    public static void main(String[] args) {
        
        // if else
        int score = 42;
        if (score >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("false");
        }

        // if else if ladder
        int accuracy = 78;
        if (accuracy >= 90) {
            System.out.println("Excellent");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }

    }
}
