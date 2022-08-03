import java.util.Scanner;

public class HwDay4 {
    public static void main(String[] args) {

        //-------------------------------------------------------Hw1 Call
//        try {
//            int arr[]={9,1,2,-1,4,8,4};
//            System.out.println(getSmallPositive(arr));
//
//        }catch (Exception e){
//            System.out.println("number in the array is negative");
//        }
        //-------------------------------------------------------Hw2

        try {
            Customer customer=new Customer(12345,"Shahad",'m');
            System.out.println(customer.toString());
        }catch (Exception e){
            System.out.println("gender must be 'm' or 'f'");
        }
        //-------
        try {
            Customer customer=new Customer(12345,"Shahad",'u');
            System.out.println(customer.toString());
        }catch (Exception e){
            System.out.println("gender must be 'm' or 'f'");
        }




    }
    //-------------------------------------------------------Hw1 Method
    public static int getSmallPositive(int[] arr) throws Exception{
        int smallest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                throw new Exception();
            }else {
                if (arr[i]<smallest){
                    smallest=arr[i];
                }
            }
        }
        return smallest;
    }

}
//-------------------------------------------------------Hw2 Class

class Customer{

    private int ID;
    private String name;
    private char gender;// 'm' or 'f'

    public Customer(int ID, String name,char gender) throws Exception{
        this.ID = ID;
        this.name = name;
        if(gender != 'm' && gender != 'f'){
            throw new Exception();
        }else {
            this.gender = gender;
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name+"("+ID+")";
    }
}
