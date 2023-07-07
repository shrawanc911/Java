public class Program_6 {
    int a = 25;
    int b = 4;
    public static void main(String args[]){
        
        // Program_6 p6 = new Program_6();
        Add a1 = new Add();
        a1.add();
        Sub s = new Sub();
        s.subtraction();
        Mult m = new Mult();
        m.multiplication();
        Div d = new Div();
        d.division();
        Rem r = new Rem();
        r.remainder();
    }
}
class Add extends Program_6{
    void add(){
        // int a=25;
        // int b=4;
        System.out.println(a+b);
    }
}
class Sub{
    void subtraction(){
        int a=25;
        int b=4;
        System.out.println(b-a);
    }
}
class Mult{
    void multiplication(){
        int a=25;
        int b=4;
        System.out.println(a*b);
    }
}
class Div{
    void division(){
        int a=25;
        int b=4;
        System.out.println(a/b);
    }
}
class Rem{
    void remainder(){
        int a=25;
        int b=4;
        System.out.println(a%b);
    }
}
