package section8_stream.module1;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<Person> persons = new ArrayList<Person>();

    static {
        for (int i = 1; i < 21; i++) {
            persons.add(new Person("fN" + i, "lN" + i, 18 + i));
        }
    }

    public static List<Person> getPersons(){
        return persons;
    }
}
