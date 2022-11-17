package org.example.dao;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add( new Person(++PEOPLE_COUNT, "Tom"));
        people.add( new Person(++PEOPLE_COUNT, "Bob"));
        people.add( new Person(++PEOPLE_COUNT, "Mike"));
        people.add( new Person(++PEOPLE_COUNT, "Alan"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
