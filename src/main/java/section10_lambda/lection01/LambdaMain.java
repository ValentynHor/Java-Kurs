package section10_lambda.lection01;


public class LambdaMain {

    public static void main(String[] args) {

        var runner = new Runner();

        //I
        runner.run(new ExecutableImpl());

        //II
        runner.run(new Executable() {
                       @Override
                       public int execute(int a, int b) {
                           return a + b;
                       }
                   }
        );

        //III
        runner.run((a, b) -> a + b);

        //IV
        int x = 5;
        runner.run((a, b) -> a + b + x);


/*

        runner.run(() -> {
            System.out.println("hello");
            System.out.println("goodbye");
            return 2;
        });

*/

    }
}
