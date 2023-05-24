
// # Day 40 coding Statement: Write a Program to Replace substring in a string
// # Description
// # Get a string as input from the user and then get another string which has to be removed from the string.
// # Get the third input, the new substring which is placed in that substring position.
// # Finally print the output by replacing the substring with new string.
// # Input
// # Enter a string
// # talentbattle
// # Enter the substring to be removed:
// # talent
// # Enter the new substring:
// # student
// # Output
// # The new string:
// # studentbattle
import java.util.Scanner;

public class replaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the full string: ");
        String full = sc.nextLine();
        System.out.println("enter the string to remove: ");
        String s1 = sc.nextLine();
        System.out.println("enter the string to add: ");
        String s2 = sc.nextLine();
        replace(full, s1, s2);
    }

    public static void replace(String f, String s1, String s2) {
        if (f.contains(s1)) {
            String a = f.substring(s1.length(), f.length());
            System.out.println(s2 + a);
        }

    }
}