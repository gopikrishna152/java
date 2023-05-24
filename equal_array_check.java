
// # Day 42 coding Statement: Write Program to check if two arrays are the same or not
// # Description
// # Get two arrays as the input from the user and check whether it is the same or not .
// # Input
// # Enter the size of first array:
// # 3
// # Enter the size of second array:
// # 3
// # Enter elements of first array:
// # 1 2 3
// # Enter elements of second array:
// # 1 2 3
// # Output
// # Same
import java.util.Arrays;
import java.util.Scanner;

public class equal_array_check {

    public static void main(String[] args) {
        solution s = new solution();
        s.solution1();
    }

}

class solution {
    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array ");
        int a = sc.nextInt();
        System.out.println("enter the size of second array ");
        int b = sc.nextInt();

        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        if (a != b) {
            System.out.println("not same");
            return;
        } else {
            inserting(arr1, a);
            System.out.println("now inserting intosecond array...");
            inserting(arr2, a);
        }

        if (Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
            System.out.println("same.");
        } else {
            System.out.println("not same");
        }
    }

    public static void inserting(int[] arr, int a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            System.out.println("enter the elements: ");
            arr[i] = sc.nextInt();
        }
    }
}
