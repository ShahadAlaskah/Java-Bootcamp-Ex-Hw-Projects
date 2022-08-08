import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble> list=new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public boolean add(PayAble p){
        try {
            list.add(p);
            return true;
        }catch (Exception e){
            return false;
        }

    }
    public double computeAmount(){
        double totalAmount=0;
        for (int i = 0; i < list.size(); i++) {
            totalAmount+=list.get(i).computeAmount();
        }
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "payables=" + list +
                ", name='" + name + '\'' +
                '}';
    }
}
