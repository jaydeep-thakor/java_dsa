import java.util.Scanner;

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

        int age = 22;
        char gender = 'M';

        if(gender == 'M'){
            if(age >= 18){
                System.out.println("You are male and age >= 18");
            }else{
                System.out.println("You are male and age <= 18");
            }
        }else{
            if(age >= 18){
                System.out.println("You are female and age >= 18");
            }else{
                System.out.println("You are female and age <= 18");
            }
        }

        boolean hasSubscription = true;
        int solvedProblems = 780;

        if(hasSubscription){
            if(solvedProblems >= 500){
                System.out.println("Unblock Advanced Sheet");
            }else{
                System.out.println("Practice More Problems");
            }
        }else{
            System.out.println("Upgrade to Premium");
        }

        // Ternary operator
        int streakDays = 200;
        String status = (streakDays >= 100) ? "Consistent" : "Irregular";
        System.out.println(status);

        // Switch case statement
        System.out.println("Enter the value of day = ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("Invalid input");
        }
        

    }
}
