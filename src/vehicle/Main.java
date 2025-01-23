package vehicle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 120);

        car1.accelerate();
        Car.brake();
    }
}