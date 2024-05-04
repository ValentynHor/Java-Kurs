package section4;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        {
            System.out.println("Tabelle1");

            var to = 9;

            for (int i = 1; i <= to; i++) {
                for (int j = 1; j <= to; j++) {
                    var res = i * j;
                    System.out.print((res == 1 ? "" : res) + "\t");
                }
                System.out.println();
            }
        }

        {
            System.out.println("Tabelle2");

            var to = 9;

            for (int i = 2; i <= to; i++) {
                for (int j = 2; j <= to; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        }
        {
            var to = 9;
            var cols = 4;

            //display results
            for (int r = 2; r <= to; r += cols) {
                for (int i = 2; i <= to; i++) {
                    for (int j = r; j < r + cols && j <= to; j++) {
                        System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}