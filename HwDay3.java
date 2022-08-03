import java.util.ArrayList;
import java.util.Scanner;

public class HwDay3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //------------------------------------Hw1 Call
//        System.out.println("Enter number:");
//        int num = sc.nextInt();
//
//        System.out.println(isPrime(num));
        //------------------------------------Hw2 Call
//        System.out.println("Enter price:");
//        double num = sc.nextDouble();
//        System.out.println("Tax is: "+calculateTax(num));
        //------------------------------------Hw3 Call
//        System.out.println("Enter word:");
//        String word = sc.nextLine();
//        System.out.println(palindrome(word));



    }
    //------------------------------------Hw1 Method
    public static String isPrime(int num){

        if(num <= 1){
            return "Not prime number";
        }else {
            for (int i = 2; i < num ; i++) {
                if(num%i == 0){
                    return "Not prime number";
                } 
            }
            return "Prime number";
        }
       
    }
    //------------------------------------Hw2 Method
    public static double calculateTax(double price){


        if (price <= 500 && price >=100 ) {
            return  price * 15/100;
        }else {
            return  0.0;
        }

    }
    //------------------------------------Hw3 Method
    public static String palindrome(String word){

        String newWord=word.toLowerCase();

        ArrayList <Character> wordArr=new ArrayList<>();
        ArrayList <Character> reverseArr=new ArrayList<>();

        for (int i = 0; i < newWord.length(); i++) {
            wordArr.add(newWord.charAt(i));
        }
        for (int i = wordArr.size() - 1 ; i >= 0; i--) {
            reverseArr.add(wordArr.get(i));
        }
        for (int i = 0; i <  newWord.length(); i++) {
            if(wordArr.get(i) != reverseArr.get(i)){
                return "not palindrome";
            }
        }
        return "is palindrome";


    }



}
