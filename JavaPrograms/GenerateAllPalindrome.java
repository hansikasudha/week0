import java.util.Scanner;

public class GenerateAllPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int temp = i;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (i == reverse) {
                System.out.print(i + " ");
            }
        }
    }
}