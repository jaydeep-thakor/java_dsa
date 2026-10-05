public class DSAMaths {

    // Q-1 - print digits of a number
    static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    // Q-2 - count digits of a number
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Q-3-A - sum of all the digits
    static float sumOfNumber(float[] nums) {
        float sum = 0;
        for (float num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    // float → int — explicit casting
    // static int sumOfNumber(float[] nums) {
    // int sum = 0;

    // for (float num : nums) {
    // sum = sum + (int) num;
    // }

    // return sum;
    // }

    // float → double — widening conversion
    // static double sumOfNumber(float[] nums) {
    // double sum = 0;

    // for (float num : nums) {
    // sum = sum + num;
    // }

    // return sum;
    // }

    // Q-3-B - sum of all the digits
    static int sumOfNumber(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    // Q-4 - reverse number
    static int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    // Q-5 - is palindrome
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if (originalNum == reverseNum) {
            System.out.println("num is palindrome");
            return true;
        } else {
            System.out.println("num is not palindrome");
            return false;
        }
    }

    // Q-6 - prime numner
    /*
     * - should be greater than 1
     * - divisible only by 1 and itself
     */
    static boolean isPrimeOrNot(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Q-7 find GCD
    static int getGCD(int a, int b) {
        while (b != 0) {
            int oldValOfB = b;
            b = a % b;
            a = oldValOfB;
        }
        int ans = a;
        return ans;
    }

    // Q-8 find LCM
    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }

    // Q-9 find Armstrong number
    static boolean isArmstrongNum(int num) {
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            System.out.println("digit" + digit);
            sum = sum + (int) Math.pow(digit, 3);
            // sum = sum + digit*digit*digit;
            num = num / 10;
        }
        if (sum == originalNum) {
            System.out.println("num is Armstrong");
            return true;
        } else {
            System.out.println("num is not Armstrong");
            return false;
        }
    }

    // Q-10 - find divisors or check perfect number
    static boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                int firstFactor = i;
                int secondFactor = num / i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] a) {

        // 1
        int num1 = 7898;
        printDigits(num1);

        // 2
        int num2 = 111296;
        int numCount = countDigits(num2);
        System.out.println(numCount);

        // 3-A
        float[] marks = { 88.75f, 78.99f, 99.67f, 78.98f };
        float sumOfMarks = sumOfNumber(marks);
        System.out.println(sumOfMarks);

        // 3-B
        int num3 = 875069;
        int sumOfNum3 = sumOfNumber(num3);
        System.out.println(sumOfNum3);

        // 4
        int num4 = 87;
        int revNum = reverseNum(num4);
        System.out.println(revNum);

        int num5 = 1221;
        boolean isPalindromeNum = isPalindrome(num5);
        System.out.println(isPalindromeNum);

        int num6 = 7;
        boolean isPrime = isPrimeOrNot(num6);
        System.out.println(isPrime);

        int num7A = 18;
        int num7B = 12;
        System.out.println(getGCD(num7A, num7B));

        System.out.println(getLCM(num7A, num7B));

        int num9 = 153;
        System.out.println(isArmstrongNum(num9));

        int num10 = 6;
        System.out.println(checkPerfectNumber(num10));

    }

}
