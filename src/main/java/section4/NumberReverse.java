package section4;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {

        System.out.println("Gib ein Zahl ein:");
        var number = new Scanner(System.in).nextInt();

        // processing
        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }

        // display results
        System.out.println("Reverse number: " + result);
    }
}