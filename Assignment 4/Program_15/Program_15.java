class Program_15 {
    int id;
    String name;
    String division;
    Program_15(int a, String b, String c){
        id = a;
        name = b;
        division=c;
    }
    void display(){
        System.out.println(id+" is the id of student");
        System.out.println(name+" is the name of student");
        System.out.println(division+" is the division of student");
    }
    public static void main(String args[]){
        Program_15 p15 = new Program_15(101, "Ramesh", "3A2");
        p15.display();
        Program_15 p14 = new Program_15(102, "Khushi yadav", "3A1");
        p14.display();
        Program_15 p13 = new Program_15(103, "Sagar kumar", "3A6");
        p13.display();
        Program_15 p12 = new Program_15(104, "Vandan nandwana", "3A10");
        p12.display();
        Program_15 p11 = new Program_15(105, "Nikhil kumar", "3A9");
        p11.display();
    }
}
