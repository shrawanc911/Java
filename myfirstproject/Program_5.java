public class Program_5 {
    int a =25;
    static int b=4;
    public static void main(String args[]){
        // int a=25;
        
        Program_5 p5 = new Program_5();
        p5.add();
        p5.sub();
        p5.mul();
        p5.division();
        p5.remainder();
    }
    void add(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(b-a);
    }
    void mul(){
        System.out.println(a*b);
    }
    void division(){
        System.out.println(a/b);
    }
    void remainder(){
        System.out.println(a%b);
    }
}
