import java.util.Scanner;
class Program_13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        Add a1 = new Add();
        a1.add(a,b);
        Sub s = new Sub();
        s.subtraction(a,b);
        Mult m = new Mult();
        m.multiplication(a,b);
        Div d = new Div();
        d.division(a,b);
        Rem r = new Rem();
        r.remainder(a,b);
    }
}
class Add {
    void add(int a,int b){
        System.out.println((a+b)+" is the sum of variables");
    }
}
class Sub{
    void subtraction(int a, int b){
        
        System.out.println((a-b)+" is the substraction of variables");
    }
}
class Mult{
    void multiplication(int a , int b){
        
        System.out.println((a*b)+" is the multiplication of variables");
    }
}
class Div{
    void division(int a , int b){
       
        System.out.println((float)a/b+" is the division of variables");
    }
}
class Rem{
    void remainder(int a , int b){
        
        System.out.println((a%b)+" is the remainder of variables");
    }
}



