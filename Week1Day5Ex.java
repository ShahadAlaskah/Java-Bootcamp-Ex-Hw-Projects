import java.util.Scanner;

public class Week1Day5Ex {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        //------------------------------------------Ex1
//        System.out.println("Enter your first number: ");
//        double firstNumber=in.nextDouble();
//        System.out.println("Enter your second number: ");
//        double secondNumber=in.nextDouble();
//        System.out.println("Choose your operation :\n 1.( + )\n 2.( - )\n 3.( / )\n 4.( * )\n 5.( % ) ");
//        String operation=in.next();
//        System.out.println(firstNumber+" "+operation+" "+secondNumber+" = "+cal(firstNumber,secondNumber,operation));
        //------------------------------------------Ex2

//        System.out.println("Choose 1.rock 2.paper 3.scissors  ");
//        int user=in.nextInt();
//
//        int arr[]={1,2,3};
//        int rnd = (int)(Math.random()*arr.length);
//        int program=arr[rnd];
//
//        System.out.println("user: "+user+"\nprogram: "+program);
//
//        if(user==program){
//            System.out.println("draw");
//        }else if (user!=program){
//            if (user == 1 && program==3) {
//                System.out.println("win");
//            } else if (user == 2 &&program==1) {
//                System.out.println("win");
//            }else if (user == 3 &&program==2) {
//                System.out.println("win");
//            }else {
//                System.out.println("lose ");
//            }
//        }
        //------------------------------------------Ex3
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);







    }
    public static double cal(double firstNumber,double secondNumber,String operation){
        if(operation.equals("+")){
            return firstNumber+secondNumber;
        }else if(operation.equals("-")){
            return firstNumber-secondNumber;
        }else if(operation.equals("/")){
            return firstNumber/secondNumber;
        }else if(operation.equals("*")){
            return firstNumber*secondNumber;
        }else if(operation.equals("%")){
            return firstNumber%secondNumber;
        }else {
            return 0.0;
        }

    }
}
class Account{
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance=this.balance+amount;
        return balance+amount;
    }
    public int debit(int amount) {
        if(amount<=this.balance){
            this.balance=this.balance-amount;

        }else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(Account account,int amount) {
        if(amount<=this.balance){
            this.balance=this.balance-amount;
            account.credit(amount);

        }else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
