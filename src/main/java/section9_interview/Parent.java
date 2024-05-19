package section9_interview;

class Parent {

    private String privateVariable = "";
    protected String protectedVariable = "";

    Parent() {
        System.out.println("Parent()");
        System.out.println("protectedVariable = " + protectedVariable);
        System.out.println("privateVariable = " + privateVariable);
    }

    Parent(String str) {
        this.protectedVariable = str;
        this.privateVariable = "privateVariable" + str;
        System.out.println("protectedVariable = " + protectedVariable);
        System.out.println("privateVariable = " + privateVariable);
    }

    public void print() {
        System.out.println("Parent's print method");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("Child's print method");
    }
}

class SubChild extends Child {

    @Override
    public void print() {
        System.out.println("SubChild's print method");
    }


}



