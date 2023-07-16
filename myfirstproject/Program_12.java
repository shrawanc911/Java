import java.util.Scanner;
class Program_12 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        Program_12 p12 = new Program_12();
        p12.add(a,b);
        p12.sub(a,b);
        p12.mul(a,b);
        p12.division(a,b);
        p12.remainder(a,b);
    }
    void add(int a, int b){
        System.out.println((a+b)+" is the sum of variables");
    }
    void sub(int a , int b){
        System.out.println((a-b)+" is the substraction of variables");
    }
    void mul(int a , int b){
        System.out.println((a*b)+" is the multiplication of variables");
    }
    void division(int a, int b){
        System.out.println((float)a/b+" is the division of variables");
    }
    void remainder(int a, int b){
        System.out.println((a%b)+" is the remainder of variables");
    }
}
