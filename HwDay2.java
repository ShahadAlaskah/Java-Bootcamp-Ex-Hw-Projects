
import java.util.Scanner;
public class HwDay2 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        //------------------------- Hw1 -------------------------

        System.out.println("Enter grade:");
        int num = myObj.nextInt();

        for (int i=100;i>=0;i=i-5) {
            if (num >= i && num <= i + 2) {
                System.out.println("Final grade is:" + num);
            } else if (num <= i + 5 && num > i + 2) {
                System.out.println("Final grade is:" + (i + 5));
            }
        }

        //------------------------- Hw2 -------------------------

//        System.out.println("Enter num:");
//        int num = myObj.nextInt();
//
//        int result=num;
//        for(int i =num-1; i!=0;i--){
//            result=result*i;
//        }
//        System.out.println(result);

        //------------------------- Hw3 -------------------------

//        for(int i =1;i<=100;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            }
//            else if (i%3==0) {
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }


    }

}
