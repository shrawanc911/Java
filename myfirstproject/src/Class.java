import java.util.Scanner;
public class Class {
    static int a;
    static int b;
    public static void main(String args[]){
        System.out.println("Hello World");
        // calculation(); 
        Scanner w = new Scanner(System.in);
        a = w.nextInt();
        b = w.nextInt();
        Class c = new Class();
        Sk s= new Sk();
        c.calculation();
        c.hr();
        c.dev();
        s.pattern();

    }
    void hr(){
        System.out.println("Hello HR...");
    }
    void dev(){
        System.out.println("Hello Developer....");
    }
    void per(){
        System.out.println("Percentage is this:");
    }
     void calculation(){
        // int a=10;
        // int b=20;
        System.out.println("Sum is this:"+(a+b));
        System.out.println("Substraction is this:"+(b-a));
        System.out.println("Multiplication is this:"+(a*b));
        System.out.println("Division is this:"+(float)a/b);
        System.out.println("Remainder is this:"+(a%b));
    }
}
class Sk extends Class
{
    void pattern(){
        for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
                System.out.print(" * ");
        }
        System.out.println();
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}