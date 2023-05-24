import java.util.ArrayList;
import java.util.Arrays;

// This problem was asked by Stripe.
// Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
// You can modify the input array in-place.

public class day4 {
    public static void main(String[] args) {
        System.out.println(sol());
    }

    public static int sol() {
        int[] ar = new int[] { 1, 2, 0 };
        // int[] ar1 = new int[ar.length];
        // System.out.println(Arrays.toString(ar));

        int max = ar[0];
        int min = ar[0];
        for (int ele : ar) {
            if (ele > max) {
                max = ele;
            }
            if ((ele < min) && ele > 0) {
                min = ele;
            }
        }
        // System.out.println(max + " " + min);
        int temp;
        for (int i = 0; i < ar.length; i++) {
            while (ar[i] >= min && ar[i] <= max && (ar[i] != ar[ar[i] - 1])) {
                temp = ar[i];
                ar[i] = ar[ar[i] - 1];
                ar[temp - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != i + 1)
                return (i + 1);
        }
        // If array has values from 1 to n
        return (ar.length + 1);

    }
}