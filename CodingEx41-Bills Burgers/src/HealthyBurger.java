public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, price, "Whole wheat");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;

    }
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        if (healthyExtra1Name != null) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            System.out.println("Added " + healthyExtra2Price + " for an extra " + healthyExtra2Price);
        }
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
