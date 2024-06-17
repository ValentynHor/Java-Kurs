package section9_interview.equals_hash;

public class Main {
    public static void main(String[] args) {

        /*
        1) wenn hashcode() nicht gleich, dann Objs. sind verschiedene
        2) wenn hashcode() gleich, dann equals()
        3)
         */

        var person = new Person(5);
        var person2 = new Person(5);

        var car = new Car(5);

        System.out.println(person.hashCode());
        System.out.println(car.hashCode());

        System.out.println(person.equals(person2));

        String s;
    }
}
