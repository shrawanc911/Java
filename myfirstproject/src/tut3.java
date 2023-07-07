import java.util.Scanner;

public class tut3 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        // if(a>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }
        switch(a){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default: System.out.println("Invalid input");
        }
        }
}
}
