// import java.util.*;
public class loop {
    public static void main(String[] args){
        // try( Scanner ss = new Scanner(System.in)){
        //     int n = ss.nextInt();
        //     int j=1;
        //     int k=0;
            
        //     while(j<11){
        //         k=j*n;
        //         j++;
        //         System.out.println(k);
        //     }
            
        // }   
        // int n=5;
        //     for (int i = 0; i < n; i++) {
        //         for (int j = 0; j < 5; j++) {
        //             System.out.print(" * ");
        //         }
        //         System.out.println();
        //     }
        int n=4;
        // int m=5;
        // int l=1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    int sum = (i+j);
                    if (sum % 2 == 0) {
                        System.out.print("1");
                        }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        // int l=1;
        //     for (int i = 1; i <= n; i++) {
        //         for (int j = 1; j <= i; j++) {
                    
        //             System.out.print(l);
        //             l++;
        //         }
        //         System.out.println();
        //     }


            // for (int i = n; i >= 0; i--) {
            //     for (int j = 0; j <= i; j++) {
            //         System.out.print(+(j+1));
            //     }
            //     System.out.println();
            // }


            // for (int i = 0; i <= n; i++) {
            //     for (int j = 0; j <= i; j++) {
            //         System.out.print(+(j+1));
            //     }
            //     System.out.println();
            // }


        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");    
        //     }
        //     System.out.println();
        // }



        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");    
        //     }
        //     System.out.println(); 
        // }


        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i==1 || j==1 || i==n || j==m ) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
    
}
