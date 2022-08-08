import javax.xml.crypto.Data;

public class Visit {
    private Customer customer;
    private Data data;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name,Data data) {
        this.data = data;
        Customer customer=new Customer(name);
    }

    public String getData() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    //chan
    public double getTotalExpense() {
        return getProductExpense()*getServiceExpense();
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", data=" + data +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
