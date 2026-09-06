import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of firstNum : ");
        int firstNum = sc.nextInt(); 
        System.out.println("Enter the value of secondNum : ");
        int secondNum = sc.nextInt();
        int ans = firstNum+secondNum;
        System.out.println("the sum of first number and second number is : "+ ans);

        // String
        String name = sc.next();
        // Full line String
        String sentence = sc.nextLine();
        // Integer
        int age = sc.nextInt();
        // Long
        long population = sc.nextLong();
        // Short
        short marks = sc.nextShort();
        // Byte
        byte value = sc.nextByte();
        // Float
        float price = sc.nextFloat();
        // Double
        double salary = sc.nextDouble();
        // Boolean
        boolean flag = sc.nextBoolean();
        // BigInteger
        BigInteger number = sc.nextBigInteger();
        // BigDecimal
        BigDecimal amount = sc.nextBigDecimal();

        // Best practice: close the Scanner to release system resources.
        sc.close();

        // Java Garbage collector
        // Objects → Heap memory
        // Memory is managed automatically by the Garbage Collector (GC).
        // GC removes objects that are no longer being used/referenced.
        // This reduces the chances of Memory Leaks.

    }
    
}
