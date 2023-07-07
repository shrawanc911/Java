import java.util.*;
public class exrecise {
    // public static void sumOfOddNumber(int n){
    //     int i=1;
    //     int sum=0;
    //     while(i<=n){
    //         sum = i+sum;
    //         i=i+2;
    //     }
    //     // System.out.printf("%d is the sum of odd numbers",sum);
    //     System.out.println(sum);
    //     return;
    // }
    // public static void main() {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     // sumOfOddNumber(n);
    //     int i=1;
    //     int sum=0;
    //     while(i<n){
    //         sum+=i;
    //         i++;
    //         System.out.println(sum);
    //     }
    //     // System.out.printf("%d is the sum of odd numbers",sum);
    //     System.out.println(sum);
    // }
    public static void greaterNumber(int a, int b){
        if (a<b) {
            System.out.println(b+" is the greater number");
        }
        else if(a>b){
            System.out.println(a+" is the greater number");
        }
        else {
            System.out.println("Both are equal number");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNumber(a,b);

    }
}
