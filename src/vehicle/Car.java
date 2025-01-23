package vehicle;

public class Car {
    private String brand;
    private String model;
    private int hp;

    public Car(String brand, String model, int hp) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getHp() {
        return this.hp;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }
    public static void brake() {
        System.out.println("The vehicle is braking.");
    }
}