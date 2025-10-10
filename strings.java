//1. Strings - length()

import java.util.Scanner;
public class StringMethod1Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int length = inputString.length();
        System.out.println(length);
        scanner.close();
    }
}

//2. Strings - toUpperCase()

import java.util.Scanner;
public class StringMethod2ToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String upperCaseString = inputString.toUpperCase();
        System.out.println(upperCaseString);
        scanner.close();
    }
}

//3. Strings - charAt(int index)

import java.util.Scanner;
public class StringMethod4CharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int index = scanner.nextInt();
        if (index >= 0 && index < inputString.length()) {
            char character = inputString.charAt(index);
            System.out.println(character);
        } else {
            System.out.println("Invalid index.");
        }
        scanner.close();
    }
}

//4. Strings - indexOf(String str)

import java.util.Scanner;
public class StringMethod5IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = scanner.nextLine();
        String searchString = scanner.nextLine();
        int index = mainString.indexOf(searchString);
        System.out.println(index);
        scanner.close();
    }
}

//5. Strings - toLowerCase()

import java.util.Scanner;
public class StringMethod3ToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String lowerCaseString = inputString.toLowerCase();
        System.out.println(lowerCaseString);
        scanner.close();
    }
}

//6. Strings - concat(String str)

import java.util.Scanner;
public class StringMethod6Concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String result = firstString.concat(secondString);
        System.out.println(result);
        scanner.close();
    }
}

//7. Strings - equals(Object anObject)

import java.util.Scanner;
public class StringMethod7Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        boolean isEqual = firstString.equals(secondString);
        System.out.println(isEqual);
        scanner.close();
    }
}

//8. Strings - substring(int beginIndex)

import java.util.Scanner;
public class StringMethod8Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int startIndex = scanner.nextInt();
        if (startIndex >= 0 && startIndex < inputString.length()) {
            String substring = inputString.substring(startIndex);
            System.out.println(substring);
        } else {
            System.out.println("Invalid start index.");
        }
        scanner.close();
    }
}

//9. Strings - trim()

import java.util.Scanner;
public class StringMethod9Trim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String trimmedString = inputString.trim();
        System.out.println(trimmedString);
        scanner.close();
    }
}

//10. Strings - replace(char oldChar, char newChar)

import java.util.Scanner;
public class StringMethod10Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char oldChar = scanner.next().charAt(0);
        char newChar = scanner.next().charAt(0);
        String replacedString = inputString.replace(oldChar, newChar);
        System.out.println(replacedString);
        scanner.close();
    }
}
//Palindrome
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        for(int i=0, j=str1.length()-1; i<j; i++, j--){
            if(str1.charAt(i)!=str1.charAt(j)){
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
//Panagram
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        for( char i='a'; i<='z'; i++){
            if(str.indexOf(i)==-1){
                System.out.println("Not a panagram");
                return;
            }
        }
        System.out.println("Panagram");
    }
}

/*
1.Checking the character type
isLetter(char ch): Checks if the character is letter.
isDigit(char ch): Checks if the character is digit.
isLetterOrDigit(char ch): Checks if the character is letter or digit.
isWhitespace(char ch): Checks if the character is whitespace.
isLetter(char ch): Checks if the character is letter.
isUpperCase(char ch): Checks if the character is uppercase.
isLowerCase(char ch): Checks if the character is lowercase.

2.Character Conversion
toUpperCase(char ch): Converts the character to Uppercase.
toLowerCase(char ch): Converts the character to Lowercase.
toTileCase(char ch): Converts the character to Title.

3.Methods
sb.append()
sb.insert()
sb.replace()
sb.delete()
sb.reverse()
sb.toString()
sb.length()
sb.charAt()
sb.setCharAt()
*/
