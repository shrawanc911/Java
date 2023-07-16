import java.util.Scanner;
class SPS {
    public static void main(String args[]){
        System.out.println("Enter 1 for Stone\nEnter 2 for Paper\nEnter 3 for Scissors");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        SPS s=new SPS();
        s.game(choice);

    }
    void game(int a){
        int computer=(int) ((Math.random() * 4) + 1);
        System.out.println(computer);
        if(a==1 && computer==1){
            System.out.println("Match draw");
        }else if(a==1 && computer==2){
            System.out.println("Computer is winner");
        }else if(a==1 && computer==3){
            System.out.println("You are winner");
        }else if(a==2 && computer==1){
            System.out.println("You are winner");
        }else if(a==2 && computer==2){
            System.out.println("Match draw");
        }else if(a==2 && computer==3){
            System.out.println("Computer is winner");
        }else if(a==3 && computer==1){
            System.out.println("Computer is winner");
        }else if(a==3 && computer==2){
            System.out.println("You are winner");
        }else{
            System.out.println("Match draw");
        }
    }
}
