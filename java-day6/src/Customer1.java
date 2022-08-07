class Customer1{

    private int ID;
    private String name;
    private int discount;

    public Customer1(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer1{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
}