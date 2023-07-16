// Default constructor
// class Program_14{
//     int id;
//     String name;
//     Program_14(){
//         id = 10;
//         name = "shrawan";
//     }
//     void display(){
//         System.out.println(id+" is the ID");
//         System.out.println(name+" is the name");
//     }
//     public static void main(String args[]){
//         Program_14 p14 = new Program_14();
//         p14.display();
//     }
// }




// Parameter constructor
class Program_14{
    int id;
    int salaray;
    String name;
    Program_14(int a, int b, String c){
        id = a;
        salaray=b;
        name = c;
    }
    void display(){
        System.out.println(id+" is the id");
        System.out.println(salaray+" is the salary");
        System.out.println(name+" is the name");
    }
    public static void main(String args[]){
        Program_14 p14 = new Program_14(101, 10000, "Shrawan");
        p14.display();
    }
}
