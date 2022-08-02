import java.util.Arrays;

public class Week1Day3Ex {
    public static void main(String[] args) {

        //-----------------------------------------Ex1

//        String users[]={ "Saleh","Khalid","Majed" };
//        System.out.println(Arrays.toString(users));

        //-----------------------------------------Ex2

//        for (int i = 1; i <=33; i++) {
//            if (i%5 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //-----------------------------------------Ex3

//        String arr[]={"d","a","h","a","h","s"};
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i]);
//        }

        //-----------------------------------------Ex4

//        String arr[]= {"Shahad","Mohammed","Amer","Alaskah"};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].charAt(0) != 'A') {
//                System.out.println(arr[i]);
//            }
//        }

        //-----------------------------------------Ex5 Call

//        int arr[]={1,2,3,4,5,6};
//        printArray(arr);

        //-----------------------------------------Ex6 Call

//        System.out.println(Arrays.toString(createArray(1,2,3)));

        //-----------------------------------------Ex7 Call

//        System.out.println(meessage("Shahad","Alaskah"));

        //-----------------------------------------Ex8 Call

//        System.out.println(average(1,1,1,1));

        //-----------------------------------------Ex9 Call
//        int arr[]={1,2,3,4,5,6};
//        System.out.println(max(arr));



    }
      //-----------------------------------------Ex5 Method
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
      //-----------------------------------------Ex6 Method
      public static int[] createArray(int num1,int num2,int num3){
        int arr[]={num1,num2,num3};
        return arr;
      }
      //-----------------------------------------Ex7 Method
    public static String meessage(String first,String last){
        String fullName=first+" "+last;

        return "hello"+" "+fullName;
    }
      //-----------------------------------------Ex8 Method
    public static double average(int num1,int num2,int num3,int num4){
        int arr[]={num1,num2,num3,num4};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }

        return sum/ arr.length;
    }
      //-----------------------------------------Ex8 Method
    public static int max(int[] arr){

        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max=arr[i];
            }
        }

        return max;
    }
}
