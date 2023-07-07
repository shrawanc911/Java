#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int bi=0,bu=0,riksh=0,trai=0,ca=0,cycl=0,amount=0,count=0,a;
int menu();
void bike();
void bus();
void riksha();
void train();
void car();
void cycle();
void showdetail();
void delete();
void main()
{
    int number = 0;
    while(number ==0){
        switch(menu())
        {
            case 1:
            bike();
            break;
            case 2:
            bus();
            break;
            case 3:
            riksha();
            break;
            case 4:
            train();
            break;
            case 5:
            car();
            break;
            case 6:
            cycle();
            break;
            case 7:
            showdetail();
            break;
            case 8:
            delete();
            break;
            case 9:
            exit(0);
            break;
            default:
            printf("Enter valid value");
            int decision;
            printf("Press 1 and enter to do it again or 0 to stop");
            
        }
    }
    
}
int menu()
{
    printf("Enter 1 for bike entry\n");
    printf("Enter 2 for bus entry\n");
    printf("Enter 3 for riksha entry\n");
    printf("Enter 4 for train entry\n");
    printf("Enter 5 for car entry\n");
    printf("Enter 6 for cycle entry\n");
    printf("Enter 7 for Show detail\n");
    printf("Enter 8 for delete data\n");
    printf("Enter 9 for exit\n");
    scanf("%d",&a);
    return a;
}
void delete()
{
    bi=0;
    bu=0;
    riksh=0;
    trai=0;
    ca=0;
    cycl=0;
    amount=0;
    count=0;
}
void showdetail()
{
    printf("Total entry of Bike =%d\n",bi);
    printf("Total entry of Bus =%d\n",bu);
    printf("Total entry of Riksha =%d\n",riksh);
    printf("Total entry of Train =%d\n",trai);
    printf("Total entry of Car =%d\n",ca);
    printf("Total entry of Cycle =%d\n",cycl);
    printf("Total entry =%d\n", count);
    printf("Total amount =%d\n",amount);
}
void bike()
{
    printf("Entery Successful of Bike\n");
    bi++;
    amount=amount+50;
    count++;
}
void bus()
{
    printf("Entery Successful of Bus\n");
    bu++;
    amount=amount+130;
    count++;
}void riksha()
{
    printf("Entery Successful of Riksha\n");
    riksh++;
    amount=amount+75;
    count++;
}void train()
{
    printf("Entery Successful of Train\n");
    trai++;
    amount=amount+550;
    count++;
}void car()
{
    printf("Entery Successful of Car\n");
    ca++;
    amount=amount+79;
    count++;
}
void cycle()
{
    printf("Entery Successful of Cycle\n");
    cycl++;
    amount=amount+25;
    count++;
}