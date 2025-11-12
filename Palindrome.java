import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int data = input;
        int rem = 0;
        int rev = 0;
        while (input > 0) {
            rem = input % 10;
            rev = rev * 10 + rem;
            input = input / 10;

        }
        if (rev == data) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
