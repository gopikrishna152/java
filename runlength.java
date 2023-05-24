
// This problem was asked by Amazon.
// Run-length encoding is a fast and simple method of encoding strings.
//  The basic idea is to represent repeated successive characters as a single count and character. 
// For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
// Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.
import java.util.Scanner;

public class runlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        encode(str);

    }

    public static void encode(String str) {
        int count = 0;
        for (int i = 1; i <= str.length() - 1; i++) {

            if (str.charAt(0) != str.charAt(i)) {
                // char c = str.charAt(0);
                System.out.println(i);
                encode1(str, i);

            }

        }
        // System.out.println(count);
    }

    public static void encode1(String str, int count) {

    }
}