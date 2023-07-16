import java.util.Scanner;
class Program_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value:");
        int b = sc.nextInt();
        arth ar = new arth();
        ar.arthmaticOperations(a,b);
    }
}
class arth extends Program_11{
    void arthmaticOperations(int a, int b){
        
        System.out.println((a+b)+" is the sum of variables");
        System.out.println((a-b)+" is the Substraction of variables");
        System.out.println((a*b)+" is the Multiplication of variable");
        System.out.println((float)a/b+" is the Division of variables");
        System.out.println((a%b)+" is the Remainder of variables");
    }
}
