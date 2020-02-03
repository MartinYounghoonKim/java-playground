package Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest02 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        Optional<Owner> optionalOwner = Optional.of(owner);
        System.out.println(OptionalTestExecute.getInsuranceName(optionalOwner));

        Map<String, Owner> map01 = new HashMap();
        Optional<Owner> optionalOwner1 = Optional.ofNullable(map01.get("irene"));
        System.out.println(optionalOwner1);
        int age = 1;

        OptionalInt optionalInt = OptionalInt.of(age);
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