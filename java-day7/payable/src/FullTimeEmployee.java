public class FullTimeEmployee extends Employee{
    private int weeklySalary;

    public FullTimeEmployee(String name, int id, int weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }
    public double computeAmount(){
        return 4*weeklySalary;
    }

}
