import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.nextLine();
        String s2 = "";
        // build(s1.toLowerCase());
        if (solv(s1.toLowerCase(), s2)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    public static boolean solv(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        for (int i = ch1.length - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
            // System.out.println(s2);
        }
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void build(String s1) {
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println(sb);

    }
}
