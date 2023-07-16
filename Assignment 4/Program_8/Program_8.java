class Program_8 {
    int a=25;
    public static void main(String args[]){
        Program_8 p8 = new Program_8();
        int b=4;
        System.out.println((p8.a+b)+" is the sum of variables");
        System.out.println((p8.a-b)+" is the substraction of variables");
        p8.multiply(b);
        p8.division(b);
        p8.remainder(b);
    }
    void multiply(int b){
        System.out.println((a*b)+" is the multiplication of variables");
    }
    void division(int b){
        System.out.println((float)a/b+" is the division of variables");
    }
    void remainder(int b){
        System.out.println((a%b)+" is the remainder of variables");
    }
}
