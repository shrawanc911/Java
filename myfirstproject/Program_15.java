import java.util.Scanner;
class Program_15 {
    int id;
    String name;
    int division;
    int a;
    String b;
    int c;


    Program_15(){
        id = a;
        name = b;
        division=c;
    }
    void receive(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        // a = sc.nextInt();
        System.out.println("Enter name:");
        // c= sc.nextInt();
        System.out.print("Enter division: ");
        
        b = sc.nextLine();
    }
    void display(){
        System.out.println(id+" is the id of student");
        System.out.println(name+" is the name of student");
        System.out.println(division+" is the division of student");
    }
    public static void main(String args[]){
        Program_15 p15 = new Program_15();
        p15.receive();
        p15.display();
        Program_15 p14 = new Program_15();
        p14.display();
        Program_15 p13 = new Program_15();
        p13.display();
        Program_15 p12 = new Program_15();
        p12.display();
        Program_15 p11 = new Program_15();
        p11.display();
    }
}
