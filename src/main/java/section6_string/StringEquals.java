package section6_string;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "h" + s1.substring(1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        if (s1.equals(s2)) {
            System.out.println("s1 = s2");
        }
    }
}