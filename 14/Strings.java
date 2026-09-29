import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {

    // Q-1 - print string
    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i));
        }
    }

    // Q-2 - get the length of the string
    static int getStrLength(String str){
        char[] arr = str.toCharArray();
        int strLength = arr.length;
        return strLength;
    }

    // Q-3 - count of vowels
    static int vowelCount(String str){
        int n = str.length();
        int count = 0;
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    // Q-4 - reveser a string
    static String reverseStr(String str){
        int n = str.length();
        String reverseStr = "";
        for(int i = n-1; i>=0; i--){
            reverseStr = reverseStr + str.charAt(i);
        }
        return reverseStr;
    }

    // Q-5 - find a string is palindrome or not
    static boolean isPalindrome(String str){
        String originalstring = str;
        String reverseStr = reverseStr(str);
        for(int i = 0; i<str.length(); i++){
            char ch1 = originalstring.charAt(i);
            char ch2 = reverseStr.charAt(i);
            if(ch1 != ch2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // create array from string
        String name = "Jaydeep";
        char[] nameArr = name.toCharArray();
        // System.out.println(nameArr);
        for (char ch : nameArr) {
            System.out.println(ch);
        }

        // split method
        String aboutMe = "My name is Jaydeep";
        String[] aboutMeArr = aboutMe.split(" ");
        // System.out.println(Arrays.toString(aboutMeArr));
        for (String str : aboutMeArr) {
            System.out.println(str);
        }

        // replace method
        String name1 = "hailee";
        String newName1 = name1.replace("ee", "ii");
        System.out.println(newName1);

        printString("hailee steinfeld");

        int strLength = getStrLength("hawkeye");
        System.out.println(strLength);

        int vowelCount = vowelCount("dickionson");
        System.out.println(vowelCount);

        String reverseString = reverseStr("bumblebee");
        System.out.println(reverseString);

        String checkPalindromeStr = "racecar";
        boolean checkPalindrome = isPalindrome(checkPalindromeStr);
        if(checkPalindrome){
            System.out.println(checkPalindromeStr + " is palindrome string");
        }else{
            System.out.println(checkPalindromeStr + " is not palindrome string");
        }

    }

}