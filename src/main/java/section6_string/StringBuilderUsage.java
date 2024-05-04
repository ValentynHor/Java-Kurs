package section6_string;

public class StringBuilderUsage {

    public static void main(String[] args) {
        String s = "hello";

        StringBuilder builder = new StringBuilder();
        builder.append("world");
        builder.insert(0, "hello");
        builder.insert(5, ' ');

        String result = builder.toString();
        System.out.println(result);

        builder.deleteCharAt(0);

        System.out.println(builder);

        builder.setLength(0);
        //builder.delete(0, builder.length());

        System.out.println(builder.toString());

        System.out.println("qwerty");
    }
}