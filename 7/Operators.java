public class Operators {

    public static void main(String a[]) {

        // 1 - Arithmatic Operators
        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulo
        int a = 70;
        int b = 80;
        int additionOpe = a+b;
        int subtractionOpe = a-b;
        byte subtractionOpe1 = (byte)(a-b); // explicit conversion
        long subtractionOpe2 = a-b; // implicit conversion
        int multiplicationOpe = a*b;
        int divisionOpe = a/b;
        int moduloOpe = a%b;
        System.out.println(additionOpe);
        System.out.println(subtractionOpe);
        System.out.println(subtractionOpe1);
        System.out.println(subtractionOpe2);
        System.out.println(multiplicationOpe);
        System.out.println(divisionOpe);
        System.out.println(moduloOpe);

        // 2 - Relational Operators
        // == Equal to
        // != Not equal to
        // > Greater than
        // < Less than
        // >= Greater than or equal
        // <= Less than or equal

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        // 3 - Logical Operators
        // && Logical AND
        // T T = T
        // T F = F
        // F T = F
        // F F = F

        // || Logical OR
        // T T = T
        // T F = T
        // F T = T
        // F F = F

        // ! Logical NOT
        // F = T
        // T = F

        // 4) Assignment Operators
        // = assignment
        // += Add and assign
        // -= Subtract and assign
        // *= Multiply and assign
        // /= Divide and assign
        // %= Modulo and assign
        int x = 10;
        int y = 20;
        x = x + 50;
        x += 50;
        x -= 50;
        x *= 50;
        x /= 50;
        x %= 50;

        // 5) Unary Operators
        // + Unary plus
        // - Unary minus
        // ++ Increment
        // -- Decrement
        // ! Logical complement

        int num1 = 700;
        int num2 = 800;
        System.out.println(++num1);
        System.out.println(num1);
        System.out.println(num2++);
        System.out.println(num2);

        // 1. Widening Conversion (Implicit)
        // Converting a smaller type to a bigger type. This happens automatically, no cast needed, because there's no risk of data loss.
        // double → float → long → int → short → byte

        // 2. Narrowing Conversion (Explicit)
        // Converting a bigger type to a smaller type. This requires an explicit cast, because data can be lost.
        // byte → short → int → long → float → double
        
    }

}
