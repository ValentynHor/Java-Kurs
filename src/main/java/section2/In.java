package section2;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        System.out.println("Gib Integer ein:");
        var i = new Scanner(System.in).nextInt();
        System.out.println("Integer: " + i);

        System.out.println("Gib Double ein:");
        var d = new Scanner(System.in).nextDouble();
        System.out.println("Double: " + d);

        System.out.println("Gib Buchstabe ein:");
        var ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println("Char: " + ch);

        System.out.println("Gib Zeile ein:");
        var str = new Scanner(System.in).nextLine();
        System.out.println("String: " + str);

    }
}
