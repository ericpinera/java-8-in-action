package MethodReference;

import PersonExercice.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {
    public static void main(String...args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Tomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        System.out.println("All people");
        printPerfomConditionally(people, p-> true, System.out::println); // p->System.out.println(p)
    }

    private static void printPerfomConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people){
            if (predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
