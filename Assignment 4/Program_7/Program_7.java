class Program_7 {
    int a = 25;
    int b = 4;
    public static void main(String args[]){
        
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
class Add extends Program_7{
    void add(){
        System.out.println((a+b)+" is the sum of variables");
    }
}
class Sub{
    void subtraction(){
        int a=25;
        int b=4;
        System.out.println((a-b)+" is the substraction of variables");
    }
}
class Mult{
    void multiplication(){
        int a=25;
        int b=4;
        System.out.println((a*b)+" is the multiplication of variables");
    }
}
class Div{
    void division(){
        int a=25;
        int b=4;
        System.out.println((float)a/b+" is the division of variables");
    }
}
class Rem{
    void remainder(){
        int a=25;
        int b=4;
        System.out.println((a%b)+" is the remainder of variables");
    }
}

