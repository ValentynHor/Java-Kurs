package section6_string;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world world!";

        System.out.println("s.contains(\"world\")=" + s.contains("world"));
        System.out.println("s.contains(\"World\")=" + s.contains("World"));

        System.out.println("s.indexOf('o')=" + s.indexOf('o'));
        System.out.println("s.lastIndexOf('o')=" + s.lastIndexOf('o'));

        System.out.println("s.indexOf(\"world\")=" + s.indexOf("world"));
        System.out.println("s.lastIndexOf(\"world\")=" + s.lastIndexOf("world"));

        System.out.println("s.startsWith(\"Hello\")=" + s.startsWith("Hello"));
        System.out.println("s.endsWith(\"world\")=" + s.endsWith("world"));
        System.out.println("s.endsWith(\"!\")=" + s.endsWith("!"));

        System.out.println("s.isEmpty()=" + s.isEmpty());

        System.out.println("Ist leere String leer? "+"".isEmpty());
        System.out.println("Ist leere String blank? "+"".isBlank());
    }
}