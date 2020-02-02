package Optional;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        Optional<Owner> optionalOwner = Optional.of(owner);
        String name = optionalOwner.flatMap(Owner::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
        System.out.println(name);
    }
}

class Owner {
    private Car car;

    public Optional<Car> getCar() {
        return Optional.ofNullable(car);
    }
}

class Car {
    private Insurance insurance;

    public Optional<Insurance> getInsurance() {
        return Optional.ofNullable(insurance);
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}