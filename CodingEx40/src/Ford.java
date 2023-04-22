public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " is starting engine!";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating!";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " is braking!";
    }
}
