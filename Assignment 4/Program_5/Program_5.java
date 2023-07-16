
class Program_5 {

    public static void main(String args[]){
        arth a = new arth();
        a.arthmaticOperations();
    }
}
class arth{
    void arthmaticOperations(){
        int a=25;
        int b=4;
        System.out.println((a+b)+" is the sum of variables");
        System.out.println((a-b)+" is the Substraction of variables");
        System.out.println((a*b)+" is the Multiplication of variable");
        System.out.println((float)a/b+" is the Division of variables");
        System.out.println((a%b)+" is the Remainder of variables");
    }
}