package section8_stream.module1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var persons = Data.getPersons();

        //List Kopie
        List<Person> copiedList1 = new ArrayList<>();
        copiedList1.addAll(persons);
        List<Person> copiedList2 = new ArrayList<>(persons);


        var persons2 = persons.stream()
                .filter(p -> p.getAge() <= 25)
                //.sorted() //wenn Person implements Comparable<Person>
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .toList();

        var persons3 = persons.stream()
                .map(p -> new Person(p.getFirstName(), p.getLastName(), p.getAge() + 1))
                .toList();

        Optional<Person> person = persons.stream()
                .filter(p->p.getAge()>60)
                        .findFirst();
//        if (person.isPresent()){
//            System.out.println(person.get());
//        }else{
//            System.out.println("Person not found");
//        }
        System.out.println("Person > 60");
        person.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Person not found")
        );




//        for (Person p : persons) {
//            System.out.println(p);
//
//        }
        System.out.println("Persons2");
        persons2.forEach(System.out::println);

        System.out.println("Persons3: 1 Jahr älter");
        persons3.forEach(System.out::println);



    }
}
