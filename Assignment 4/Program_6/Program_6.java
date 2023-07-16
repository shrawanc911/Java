class Program_6 {
    int a =25;
    static int b=4;
    public static void main(String args[]){
        // int a=25;
        
        Program_6 p6 = new Program_6();
        p6.add();
        p6.sub();
        p6.mul();
        p6.division();
        p6.remainder();
    }
    void add(){
        System.out.println((a+b)+" is the sum of variables");
    }
    void sub(){
        System.out.println((a-b)+" is the substraction of variables");
    }
    void mul(){
        System.out.println((a*b)+" is the multiplication of variables");
    }
    void division(){
        System.out.println((float)a/b+" is the division of variables");
    }
    void remainder(){
        System.out.println((a%b)+" is the remainder of variables");
    }
}

