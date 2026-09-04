import java.util.Arrays;

class Datatypes {
    public static void main(String[] args) {

        // ********************** primitive datatypes **********************

        int a = 10;
        byte b = 10;
        short c = 10;
        long d = 10000L;

        float e = 10.5F; // 'F' tells Java that 10.5 is a float literal; float has about 6–7 decimal digits of precision.
        double f = 10.10; // Decimal values are double by default, so no suffix is required. double provides about 15–16 significant decimal digits of precision.

        char g = 'j';
        boolean h = true;

        // ********************** non primitive datatypes **********************

        String s = "jaydeep";
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(s);
        System.out.println(Arrays.toString(arr));

        // Type conversion
        char ch = 'a';
        System.out.println("Character after incrementing and type casting: " + (char)(ch + 1));

        // Implicit Conversion - Implicit conversion is when Java automatically converts a smaller data type into a larger data type without us writing any extra code.
        // int a = 10;
        // double b = a;

        // Explicit Conversion - Explicit conversion is when we manually convert one data type into another using type casting.
        // double a = 10.5;
        // int b = (int) a;
        
    }
}
