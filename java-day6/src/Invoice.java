public class Invoice {
    private int id;
    private Customer1 customer1;
    private double amount;

    public Invoice(int id, Customer1 customer1, double amount) {
        this.id = id;
        this.customer1 = customer1;
        this.amount = amount;
    }

    public Customer1 getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer1 customer1) {
        this.customer1 = customer1;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
    public int getCustomerDiscount() {
        return customer1.getDiscount();
    }
    public String getCustomerName() {
        return customer1.getName();
    }
    public int getCustomerID() {
        return customer1.getID();
    }
    public double getAmountAfterDiscount() {
        return this.amount*customer1.getDiscount();
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer1=" + customer1 +
                ", amount=" + amount +
                '}';
    }
}
