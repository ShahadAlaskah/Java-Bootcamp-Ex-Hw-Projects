public class Main {
    public static void main(String[] args) {

        //-----------------------------------------Ex1 call
        int arr[]={1, 2,4,5};
        System.out.println(average(arr));
        //-----------------------------------------Ex2 call
        int arr2[]={1, 4, 17, 7, 25, 3, 100};
        NumGreaterThanAverage(arr2);
        //-----------------------------------------Ex3
        Cat cat=new Cat("lele");
        cat.greets();
        Dog dog=new Dog("gg");
        dog.greets();
        dog.greets(dog);

    }
    //-----------------------------------------Ex1 method
    public static int average(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/ arr.length;
    }
    //-----------------------------------------Ex2 method
    public static void NumGreaterThanAverage(int[] arr){
        int avr=average(arr);
        for (int i = 0; i < arr.length; i++) {
            if (avr < arr[i]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }


}