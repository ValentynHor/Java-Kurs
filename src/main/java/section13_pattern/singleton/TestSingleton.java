package section13_pattern.singleton;

public class TestSingleton {

    private static TestSingleton instance;

    private TestSingleton() {
    }

    public static synchronized TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    public void print(){
        System.out.println(this);
    }

}
