package PersonExercice;

import java.util.*;

public class PersonExerciceJava7 {
    public static void main(String...args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Tomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //Step 1: Sort list by lastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        
        //Step2: Create a method that prints all elements in the list
        System.out.println("All people");
        printAll(people);

        //Step3: Create a method that prints all people that have last name begining with C
        System.out.println("People that have last name begining with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("People that have name begining with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getName().startsWith("C");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p : people){
            if (condition.test(p)){
                System.out.println(p);
            }
        }

    }

    private static void printAll(List<Person> people) {
        for(Person p : people){
            System.out.println(p);
        }
    }

    interface Condition{
        boolean test(Person p);
    }
}
