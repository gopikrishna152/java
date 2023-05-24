// This problem was asked by Facebook.
// Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
// For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
// You can assume that the messages are decodable. For example, '001' is not allowed. 

public class day6 {
    public static void main(String[] args) {
        String str = "111";
        int l = str.length();
        int ans = solv(str.toCharArray(), l);
        System.out.println(ans);
    }

    public static int solv(char[] s, int l) {
        if (l == 0 || (l == 1 && s[0] == '0')) {
            return 0;
        }
        return sol2(s, l);

    }

    public static int sol2(char[] s, int l) {
        if (s[0] == '0') {
            return 0;
        }
        if (l == 0 || l == 1) {
            return 1;
        }
        int count = 0;
        if (s[l - 1] > 0) {
            count = sol2(s, l - 1);
        }

        if (s[l - 1] == '1' || s[l - 1] == '2' && s[l - 1] > '7') {
            count += sol2(s, l - 2);
        }
        return count;
    }
}
