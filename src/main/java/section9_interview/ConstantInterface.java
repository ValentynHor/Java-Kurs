package section9_interview;

public interface ConstantInterface {
    int COUNT1 = 100; //Implizit public, static, final

    static int ggg() {
        return COUNT1;
    }

    void aaaa();
}