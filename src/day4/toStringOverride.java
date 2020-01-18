package day4;

public class toStringOverride {
    public static void main(String[] args) {
        Person person = new Person(1, "Martin");

        System.out.println(person.toString());
    }

    public String toString() {
        return "toStringOverride{}";
    }
}

class Person {
    int id;
    String name;

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}