import java.util.ArrayList;
import java.util.Arrays;

// This problem was asked by Stripe.
// Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
// You can modify the input array in-place.

public class day4_2 {
    public static void main(String[] args) {
        sol();
    }

    public static void sol() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 0));
        int max = arr.get(0);
        int min = arr.get(0);
        for (int ele : arr) {
            // System.out.println(ele);
            if (ele > max) {
                max = ele;
            }
            if (ele < min && ele > 0) {
                min = ele;
            }

        }
        arr.sort(null);
        System.out.println(arr);
        for (int ele : arr) {
            if (!arr.contains(ele + 1) && ele > 0) {
                System.out.println(ele + 1);
                break;
            }
        }

    }
}
