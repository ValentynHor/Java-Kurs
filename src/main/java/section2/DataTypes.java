package section2;

public class DataTypes {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Integer:");
        System.out.println(Integer.MIN_VALUE + " < " + i + " < " + Integer.MAX_VALUE);

        double d = 0.0;
        System.out.println("Double:");
        System.out.println(Double.MIN_VALUE + " < " + d + " < " + Double.MAX_VALUE);

        char ch = 'a';
        System.out.println("Character:");
        System.out.println(Character.MIN_VALUE + " < " + ch + " (" + (int) ch + ") " + " < " + Character.MAX_VALUE);

        String str = "Hello Welt";
        System.out.println(str);

        var d1 = 0.;
        var d2 = 5e4;
        System.out.println(d1 + " " + d2);


    }
}
