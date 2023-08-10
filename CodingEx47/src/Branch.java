import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if (findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            System.out.println("New customer added: " + customerName);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction (String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.getTransactions().add(transaction);
            System.out.println("Transaction added: " + transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(var customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }

}
