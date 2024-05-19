package section9_interview;

import java.util.Objects;

public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyClass myClass = (MyClass) obj;
        return id == myClass.id && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "A");
        MyClass obj2 = new MyClass(1, "B");

        System.out.println("Equals: " + obj1.equals(obj2)); // Equals: false
        System.out.println("Hashcode obj1: " + obj1.hashCode());
        System.out.println("Hashcode obj2: " + obj2.hashCode());
    }
}
