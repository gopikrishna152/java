
// There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

// For example, if N is 4, then there are 5 unique ways:

// 1, 1, 1, 1
// 2, 1, 1
// 1, 2, 1
// 1, 1, 2
// 2, 2
import java.util.Scanner;

public class steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of steps: ");
        int N = sc.nextInt();
        System.out.println("the no of ways: " + solve(N));
    }

    public static int solve(int N) {
        int count = 0;
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        } else {
            count = staircase(N);
        }
        return count;

    }

    public static int staircase(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return staircase(n - 1) + staircase(n - 2);
        }
    }
}
