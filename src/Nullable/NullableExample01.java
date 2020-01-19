package Nullable;

class Person {
    private Car car;
    public Car getCar () {
        return car;
    }
}

class Car {
    private Insurance insurance;
    public Insurance getInsurance () {
        return insurance;
    }
}

class Insurance {
    private String name;
    public String getName () {
        return name;
    }
}
public class NullableExample01 {
    public static void main(String[] args) {
        Person person = new Person();
    }
    public String getCarInsuranceName (Person person) {
        return person.getCar().getInsurance().getName();
    }
}
