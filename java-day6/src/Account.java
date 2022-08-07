class Account{
    private String id;
    private Customer customer;
    private double balance;

    public Account(String id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }


    public String getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account deposit(double amount) {

     return new Account(id,customer,balance+amount);
    }
public Account withdraw(double amount) {
    if(amount<=this.balance){
        this.balance=this.balance-amount;

    }else {
        System.out.println("Amount exceeded balance");
    }
    return new Account(id,customer,balance+amount);
}


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }

    public String getCustomerName() {
        return customer.getName();
    }



}