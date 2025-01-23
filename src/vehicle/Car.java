package vehicle;

public class Car {
    private static final String brand = "";
    private static String model;
    private final int hp;

    public Car(String brand, String model, int hp) {
        this.model = model;
        this.hp = hp;
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }
    public static void brake() {
        System.out.println("The vehicle is braking.");
    }
}
