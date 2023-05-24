import java.util.Arrays;

// This problem was asked by Uber.

// Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

// For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

// Follow-up: what if you can't use division?
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        sol2();
    }

    public static void sol2() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int n = arr.length;
        int[] right = new int[n];
        int[] left = new int[n];
        int[] product = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];

        }
        System.out.println(Arrays.toString(left));
        for (int j = n - 2; j >= 0; j--) {
            right[j] = right[j + 1] * arr[j + 1];
        }
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < n; i++) {
            product[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(product));
    }

    public static void sol() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            int mul = 1;
            for (int j = 0; j < arr.length; j++) {

                if (i == j) {
                    continue;
                } else {
                    mul = mul * arr[j];

                }
            }
            newarr[i] = mul;
        }
        System.out.println(Arrays.toString(newarr));
    }
}