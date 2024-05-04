package section4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Gib ein Zahl ein:");
        var value = new Scanner(System.in).nextInt();

        // processing
        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >= 0";
        } else {
            var result = 1;
            for (var i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i; // result = result * i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
        }

        System.out.println(finalResult);
    }
}