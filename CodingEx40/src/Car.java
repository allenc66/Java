public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.engine = engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels = 4;
    }

    public String startEngine() {
        return this.getClass().getSimpleName() + " 's engine is starting!";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating!";
    }

    public String brake() {
        return this.getClass().getSimpleName() + " is braking!";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
