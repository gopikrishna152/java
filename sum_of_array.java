
// Day 46 coding Statement : Write Program to find sum of elements in an array
// Description
// Get an array as the input from the user and find the sum of the elements.
// Input
// Enter the size of array
// 3
// Enter the elements of array
// 5 10 15
// Output
// 30 
import java.util.Arrays;
import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        sol();
    }

    public static void sol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int size = sc.nextInt();
        int[] ar = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element ");
            int ele = sc.nextInt();
            sum += ele;
            ar[i] = ele;
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(sum);
    }
}
