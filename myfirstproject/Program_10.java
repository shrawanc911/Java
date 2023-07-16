import java.util.Scanner;
class Program_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        Program_10 p10 = new Program_10();
        p10.math(a,b);

    }
    void math(int a, int b){
        System.out.println((a+b)+" is the sum of two variables");
        System.out.println((a-b)+" is the subtraction of two variables");
        System.out.println((a*b)+" is the multiplication of two variables");
        System.out.println((float)a/b+" is the division of two variables");
        System.out.println((a%b)+" is the remainder of two variables");
    }

}
