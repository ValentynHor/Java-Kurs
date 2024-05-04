package section3;

public class IntOverflow {
    public static void main(String[] args) {

        {
            var i = Integer.MAX_VALUE;

            System.out.println("i = " + i);
            System.out.print("i + 1 = ");
            System.out.println(i + 1);
        }
        {
            var i = Integer.MIN_VALUE;

            System.out.println("i = " + i);
            System.out.print("i - 1 = ");
            System.out.println(i - 1);
        }


    }
}
