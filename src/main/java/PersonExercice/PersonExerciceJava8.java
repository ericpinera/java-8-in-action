package PersonExercice;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonExerciceJava8 {
    public static void main(String...args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Tomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //Step 1: Sort list by lastName
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step2: Create a method that prints all elements in the list
        System.out.println("All people");
        printPerfomConditionally(people, p-> true, p->System.out.println(p));

        //Step3: Create a method that prints all people that have last name begining with C
        System.out.println("People that have last name begining with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        System.out.println("People that have name begining with C");
        printPerfomConditionally(people, p -> p.getName().startsWith("C"), p->System.out.println(p.getName()));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for(Person p : people){
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printPerfomConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people){
            if (predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}
