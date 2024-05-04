package section3;

public class RelationalExpressions {
    public static void main(String[] args) {
        {
            var a = 2;
            var b = 5;

            System.out.println(a == b);
            System.out.println(a != b);
            System.out.println(a > b);
            System.out.println(a >= b);
            System.out.println(a < b);
            System.out.println(a <= b);
        }


        //-----------------------------------------
        {
            System.out.println("--------------- && ---------------");
            System.out.println("true \t && \t true \t = \t" + (true && true));
            System.out.println("true \t && \t false \t = \t" + (true && false));
            System.out.println("false \t && \t true \t = \t" + (false && true));
            System.out.println("false \t && \t false \t = \t" + (false && false));
        }
        {
            System.out.println("--------------- || ---------------");
            System.out.println("true \t || \t true \t = \t" + (true || true));
            System.out.println("true \t || \t false \t = \t" + (true || false));
            System.out.println("false \t || \t true \t = \t" + (false || true));
            System.out.println("false \t || \t false \t = \t" + (false || false));
        }

    }
}
