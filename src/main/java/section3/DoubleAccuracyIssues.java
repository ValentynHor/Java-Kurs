package section3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {
        {
            var a = 2;
            var b = 1.1;
            var c = a - b;

            //0.8999999999999999
            System.out.println(c);
        }
        {
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);

            //0.9
            System.out.println(c);
        }
        {
            System.out.print("Pi (double) = ");
            System.out.println(22./7);

            var a = new BigDecimal("22");
            var b = new BigDecimal("7");
            System.out.print("Pi (BigDecimal) = ");
            System.out.println(a.setScale(10).divide(b, RoundingMode.HALF_UP));
        }
    }
}
