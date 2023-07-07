// public class sum {
//     public static void main(String[] args){
//         int a=10;
//         int b=20;
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }
import java.util.*;
public class sum{
    public static void main(String[] args){
        try( Scanner ss = new Scanner(System.in)){
        int a = ss.nextInt();
        int b = ss.nextInt();
        int sum=a+b;
        System.out.println(sum);
        
        }
    }
}
