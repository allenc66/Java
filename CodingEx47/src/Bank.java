import java.util.ArrayList;

public class Bank {
    private String name;

    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch (String name){
        if (findBranch(name) == null) {
            Branch branch = new Branch(name);
            branches.add(branch);
            System.out.println("Branch " + name + " was added");
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        Customer newCustomer = new Customer(customerName, initialTransaction);
        if (branch != null) {
//            for (var customer : branch.getCustomers()){
//                if (customer.getName().equalsIgnoreCase(customerName)){
//                    System.out.println("Customer existed in the system");
//                    return false;
            return branch.newCustomer(customerName, initialTransaction);
                } else {
//                    branch.getCustomers().add(newCustomer);
//                    System.out.println("New customer " + customerName + " was added into system");
//                    return true;
                        Branch newBRanch = new Branch(branchName);
                        newBRanch.newCustomer(customerName,initialTransaction);
                        this.branches.add(newBRanch);
                }
        return false;
    }

    public boolean addCustomerTransaction (String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
//            for (var customer : branch.getCustomers()){
//                if (customer.getName().equalsIgnoreCase(customerName)){
//                    customer.getTransactions().add(transaction);
//                    System.out.println("Transaction: " + transaction + " was added");
//                    return true;
//                }
//            }
            return branch.addCustomerTransaction(customerName, transaction);
        }
        //System.out.println("Branch not found");
        return false;
    }

    private Branch findBranch (String branchName) {
        for(var branch : branches){
            if(branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }else if (printTransaction) {
            System.out.println("Customer details for branch " + branch.getName());
            for (var customer : branch.getCustomers()){
                System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer)+1) + "]");
                System.out.println("Transactions");
                for (var existedTransaction : customer.getTransactions()) {
                    String toString = String.format("%,.2f", existedTransaction);
                    System.out.println("[" + (customer.getTransactions().indexOf(existedTransaction)+1)  + "]  Amount " + toString);
                }
            }
        } if (!printTransaction) {
            System.out.println("Customer details for branch " + branch.getName());
            for (var customer : branch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer)+1) + "]");
            }
        }
        return true;
    }
}
