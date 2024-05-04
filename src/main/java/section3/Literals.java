package section3;

public class Literals {
    public static void main(String[] args) {

        var is = String.valueOf(1);
        var ds = String.valueOf(1.);
        var bs = String.valueOf(true);
        var cs = String.valueOf('a');

        System.out.println(is + ds + bs + cs);

        System.out.println("" + 1 + true);
        //Fehler
        //System.out.println(1+true+"");

        var si = Integer.parseInt("12");
        var sd = Double.parseDouble("5");
        var sb = Boolean.parseBoolean("true");
        var ch1 = "abc".charAt(0);

        System.out.println("" + si + sd + sb + ch1);

        //Bytes
        char ch = 2;
        int i = 4;
        double d = 8;

        d = i;
        d = ch;
        i = ch;

        i = (int) d;

        System.out.println("" + ch + i + d);


    }
}
