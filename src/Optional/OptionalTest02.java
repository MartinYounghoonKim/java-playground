package Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.getCar().getInsurance().getName(); // NPE 발생
        Car car = owner.getCar();
        if (car != null) {
            Insurance insurance = car.getInsurance();
            if (insurance != null) {
                // 이와 같이 반복 패턴 코드를 '깊은 의심(deep doubt)'라고 표현한다.
                String name = insurance.getName();
            }
        }
    }
}

class Owner {
    private Car car;

    public Car getCar() {
        return car;
    }
}

class Car {
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}