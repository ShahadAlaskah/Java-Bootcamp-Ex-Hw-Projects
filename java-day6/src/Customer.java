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