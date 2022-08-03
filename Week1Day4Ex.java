 public class Week1Day4Ex {
    public static void main(String[] args) {

        //--------------------------------------Ex1
//        int arr[] ={1,2,3,4,5,6,7};
//        print9thIndex(arr);
        //--------------------------------------Ex2
//        try {
//            dividedBy5(9);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
        //--------------------------------------Ex3
        Author author1=new Author("Shahad","Shahad@gmail.com");
        Author author2=new Author("Raed","Raed@gmail.com");
        //--------------------------------------Ex4
        Ball ball1=new Ball(1,3,4,5,6);
        Ball ball2=new Ball(1,3,5,7,9);
        //--------------------------------------Ex5
        Employee employee1 =new Employee(111111,"shahad","alaskah",90000);
        Employee employee2 =new Employee(22222,"raed","fahad",9000000);
        //--------------------------------------Ex6
        InvoiceItem invoiceItem1 =new InvoiceItem("111111"," ",10,40.60);
        InvoiceItem invoiceItem2 =new InvoiceItem("22222"," ",20,6.54);
        //--------------------------------------Ex7
        MyPoint myPoint1=new MyPoint(5,7);
        MyPoint myPoint2=new MyPoint(3,8);


    }
    public static void print9thIndex(int[] arr){
        try{
            System.out.println(arr[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
    public static void dividedBy5(int number) throws ArithmeticException{
        if(number%5==0){
            System.out.println(number+" is divided by 5");
        }else {
            throw new ArithmeticException("not");
        }

    }
}
//--------------------------------------------------
 class Author{
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ", email=" + email+
                ']';
    }
}
 class Ball{
     private float x;
     private float y;
     private int radius;
     private float xDelta;
     private float yDelta;

     public Ball(float x, float y, int radius, float xDelta, float yDelta) {
         this.x = x;
         this.y = y;
         this.radius = radius;
         this.xDelta = xDelta;
         this.yDelta = yDelta;
     }

     public float getX() {
         return x;
     }

     public void setX(float x) {
         this.x = x;
     }

     public float getY() {
         return y;
     }

     public void setY(float y) {
         this.y = y;
     }

     public int getRadius() {
         return radius;
     }

     public void setRadius(int radius) {
         this.radius = radius;
     }

     public float getXDelta() {
         return xDelta;
     }

     public void setXDelta(float xDelta) {
         this.xDelta = xDelta;
     }

     public float getYDelta() {
         return yDelta;
     }

     public void setYDelta(float yDelta) {
         this.yDelta = yDelta;
     }
     public void move(){
         x=x+xDelta;
         y=y+yDelta;
     }
     public void reflectHorizontal(){
         xDelta=(-xDelta);
     }
     public void reflectVertical(){
         yDelta=(-yDelta);
     }

     @Override
     public String toString() {
         return "Ball["+"("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
     }
 }
 class Employee{
    private int id;
    private String fN;
    private String lN;
    private int s;

     public Employee(int id, String fN, String lN, int s) {
         this.id = id;
         this.fN = fN;
         this.lN = lN;
         this.s = s;
     }

     public int getId() {
         return id;
     }

     public String getfN() {
         return fN;
     }
     public String getN() {
         return fN+' '+lN;
     }

     public String getlN() {
         return lN;
     }

     public int getS() {
         return s;
     }

     public void setS(int s) {
         this.s = s;
     }
     public int getAS() {
         return s*12;
     }
     public int rS(int p) {
         return  (s * p ) + s;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", fN='" + fN + '\'' +
                 ", lN='" + lN + '\'' +
                 ", s=" + s +
                 '}';
     }
 }
 class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

     public InvoiceItem(String id, String desc, int qty, double unitPrice) {
         this.id = id;
         this.desc = desc;
         this.qty = qty;
         this.unitPrice = unitPrice;
     }

     public String getId() {
         return id;
     }

     public String getDesc() {
         return desc;
     }

     public int getQty() {
         return qty;
     }

     public double getUnitPrice() {
         return unitPrice;
     }

     public void setQty(int qty) {
         this.qty = qty;
     }

     public void setUnitPrice(double unitPrice) {
         this.unitPrice = unitPrice;
     }

     public double getTotal() {
         return unitPrice*qty;
     }

     @Override
     public String toString() {
         return "InvoiceItem{" +
                 "id='" + id + '\'' +
                 ", desc='" + desc + '\'' +
                 ", qty=" + qty +
                 ", unitPrice=" + unitPrice +
                 '}';
     }
 }

 class MyPoint{
    private int x=0;
    private int y=0;

     public MyPoint() {
     }

     public MyPoint(int x, int y) {
         this.x = x;
         this.y = y;
     }

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }
     public int[] getXY() {
         int xy[]={x,y};
         return xy;
     }

     public void setXY(int x,int y) {
         this.x = x;
         this.y = y;
     }

     @Override
     public String toString() {
         return "MyPoint{" +
                 "x=" + x +
                 ", y=" + y +
                 '}';
     }

     public double distance(int x,int y){
         return Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x));
     }
     public double distance(){
         return Math.sqrt((0 - this.y) * (0 - this.y) + (0 - this.x) * (0 - this.x));
     }
 }


