import java.util.Scanner;
public class Program_7 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
            byte b = sc.nextByte();
            short c = sc.nextShort();
            long d = sc.nextLong();
            float e = sc.nextFloat();
            double f = sc.nextDouble();
            char g = sc.next().charAt(0);
            String h = sc.nextLine();
            boolean i = sc.nextBoolean();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            System.out.println(i);
        }
    }
}
