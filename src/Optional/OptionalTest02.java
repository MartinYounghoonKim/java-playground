package Optional;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        Optional<Owner> optionalOwner = Optional.of(owner);
        System.out.println(OptionalTestExecute.getInsuranceName(optionalOwner));


    }
}

class OptionalTestExecute {
    static String getInsuranceName (Optional<Owner> owner) {
        return owner.flatMap(Owner::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
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