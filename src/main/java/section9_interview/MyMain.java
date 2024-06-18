package section9_interview;


public class MyMain extends Abstract1 implements ConstantInterface, ConstantInterface2 {


    public MyMain(String name1) {
        super(name1);
    }

    public static void main(String[] args) {
        int abc = COUNT1 * 2;
        Const a = Const.AAA;

        System.out.println("SubChild");
        SubChild subChild = new SubChild();
        subChild.add(2, 4);

        System.out.println("Parent from SubChild");
        var p = new Parent();
        p.protectedVariable = "AAA";

        var immutableClass = new ImmutableClass(2, "string");
        var immutableClass2 = new ImmutableClass(2, "string2");

        System.out.println(immutableClass.equals(immutableClass2));

        var obj1 = new ImmutableClass(1, "A");
        var obj2 = new ImmutableClass(1, "B");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass());

        System.out.println("----------------------------------------");
        String s1 = "hello";
        String s2 = new String("hell0");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("----------------------------------------");
        String s3 = "hell";
        String s4 = "o";
        String s5 = s3 + s4;
        System.out.println(s1 == (s3 + s4));
        System.out.println(s1 == s5);
        System.out.println("----------------------------------------");


    }

    @Override
    public void aaaa() {

    }
}
