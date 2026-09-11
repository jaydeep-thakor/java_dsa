import java.util.Arrays;

class Datatypes {
    public static void main(String[] args) {

        // Primitive datatypes
        
        // numeric types
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 10000000000L;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        float e = 10.10F; // 'F' tells Java that 10.5 is a float literal; float has about 6–7 decimal digits of precision.
        double f = 20.20; // Decimal values are double by default, so no suffix is required. double provides about 15–16 significant decimal digits of precision.

        System.out.println(e);
        System.out.println(f);

        // non numeric types
        Boolean g = true;
        char h = 'j';

        System.out.println(g);
        System.out.println(h);
        
        // Non-Primitive datatypes
        int[] arr = {1,2,3,4,5,6,7,8};
        String str = "Jaydeep";

        System.out.println(arr);
        System.out.println(Arrays.toString(arr)); // we have to use Arrays.toString to read the elements
        System.out.println(str);

        // Type conversion
        char ch = 'a';
        System.out.println("Character after incrementing and type casting: " + (char)(ch + 1));
        
    }
}
