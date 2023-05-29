public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic Burger", "chicken", 3.98, "white");
        hamburger.addHamburgerAddition1("Tomato", 0.98);
        hamburger.addHamburgerAddition2("Lettuce", 0.98);
        hamburger.addHamburgerAddition3("Cheese", 0.50);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println("-".repeat(30));


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("-".repeat(30));

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
