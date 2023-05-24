
// Day 41 coding Statement : Check if two strings match where one string contains wildcard characters
// Description
// Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.
// Then check whether they match or not.
// Input
// Ta**nt
// Talent
// Output
// Yes they match
import java.util.Scanner;

public class wildcard_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the char ? or * : ");
        char c = sc.next().charAt(0);
        System.out.println("enter the string to  search: ");
        String s = sc.next();
        solve(c, s);
    }

    public static void solve(char c, String s) {
        if (s.contains(c + "")) {
            System.out.println("yes they match");
        } else {
            System.out.println("not match");
        }
    }
}
