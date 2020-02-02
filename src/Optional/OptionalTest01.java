package Optional;

import java.util.Optional;

public class OptionalTest01 {

    public static void main(String[] args) {
        Person nullablePerson = null;
        String nullableName = null;
        Person martin = new Person("Martin", 30);
        Optional<Person> optionalPerson = Optional
                .ofNullable(null);
        Person irene = Optional
                .ofNullable(nullablePerson)
                .orElse(new Person("Irene", 10));

        // 있을 경우
        optionalPerson.ifPresent(p -> System.out.println(p.getName()));

        System.out.println(optionalPerson.orElse(new Person("Irene", 20)).getAge());
    }

}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
