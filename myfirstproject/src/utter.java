public class utter {
    public static void main(String[] args){
        int n=5;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print("* ");
    //         }
    //         int spaces=2*(n-i);
    //         for(int j=0;j<spaces;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=0;j<i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=n;i>0;i--){
    //         for(int j=0;j<i;j++){
    //             System.out.print("* ");
    //         }
    //         int spaces=2*(n-i);
    //         for(int j=0;j<spaces;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=0;j<i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // private static void print(String string) {
        // for (int i = 0; i < n; i++) {
        //     int spaces=n-i;
        //     for (int j = 0; j < spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n; j++) {
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i <=n; i++) {
        //         int spaces=n-i;
        //         for (int j = 0; j < spaces; j++) {
        //                 System.out.print(" ");
        //         }
        //         for (int j = 0; j < i; j++) {
        //             System.out.print(i+" ");
        //         }
        //         System.out.println();
        // }
        // for (int i = 0; i <= n; i++) {
        //     int spaces=n-i;
        //     for (int j = 0; j <= spaces; j++) {
        //             System.out.print(" ");
        //     }
        //     for (int j = i; j >= 1; j--) {
        //             System.out.print(j);
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i; j++) {
                        System.out.print(" ");
                }
                for (int j = 0; j < (2*i)-1; j++) {
                        System.out.print("*");
                }
                System.out.println();
        }
        for (int i = n; i > 0; i--) {
                for (int j = 0; j < n-i; j++) {
                        System.out.print(" ");
                }
                for (int j = 0; j <(2*i)-1; j++) {
                        System.out.print("*");
                }
                System.out.println();
        }
    }
}
