import java.util.ArrayList;

// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

// Bonus: Can you do this in one pass?

import java.util.*;

public class day1 {
    public static void main(String[] args) {
        if (sol()) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }

    public static boolean sol() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 3, 7));
        int k = 13;
        // System.out.println(numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            int req = k - numbers.get(i);
            // System.out.println("sucee");
            if (numbers.contains(req) || (req == 0)) {
                // System.out.println("jujubi");
                return true;
            }

        }

        return false;
    }
}
