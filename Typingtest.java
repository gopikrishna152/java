import java.util.Scanner;

public class Typingtest {
    public static void main(String[] args) {
        long start, end = 0;
        Scanner sc = new Scanner(System.in);
        String para = "Hello this is gopikrishna";
        System.out.println(para);
        start = System.currentTimeMillis();
        String user = sc.next();
        while (true) {
            if (user.equals(para)) {
                end = System.currentTimeMillis();
                System.out.println("success");
                break;
            } else {
                System.out.println("sorry there is mistake");
                end = System.currentTimeMillis();
                break;
            }
        }
        System.out.println(end - start);

    }
}
