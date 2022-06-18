package team_project;
//---------------->Teams Member Name : <------------------------


    //Roll Number : 21124006                       NAME : ANISH KUMAR GUPTA
    //Roll Number : 21124005                       NAME : ANIKET SUNIL INGLE
    //Roll Number : 21124009                       NAME : ANURAG KAMBOJ
// ------------------------------------------------------------------



import java.util.*;
import java.util.Scanner;
 class Person{
    int password;
    double account_no;
    double account_balance ;
  
    public Person(int password, double account_no , double balance   ) {
        this.account_no = account_no;
        this.password = password;
        this.account_balance = balance;
    }

}
 public class user{
    public static void main(String args[]){
        int store =0 ;
        Scanner sc = new Scanner(System.in);

        Person[] obj;
        obj = new Person[5];
        obj[0] = new Person(1234,12341234, 100000);
        obj[1] = new Person(2345,23452345, 200000);
        obj[2] = new Person(3456,34563456, 300000);
        obj[3] = new Person(3456,34563456, 400000);
        obj[4] = new Person(4567,45674567, 500000);

        System.out.println("Enter the account Number: ");
        double a = sc.nextDouble();  
        boolean account_check = false;
        boolean password_check = false;
        
                    
        for(int i = 0 ; i<5; i++){
        if(obj[i].account_no == a ){
            account_check = true;
            break;
            }
        }
        if(account_check){

            System.out.println("Account number is found: ");
            System.out.println("Enter the password: ");
            int p = sc.nextInt();   
            
            for(int i = 0 ; i<5; i++){
              if(obj[i].password == p  && obj[i].account_no == a ){
                  password_check = true;
                  store = i;
                break;
                }
            }
            if(password_check){
            System.out.println("Your password and account number matches :");




                System.out.println("choose 1 to withdraw");
                System.out.println("choose 2 to Deposit");
                System.out.println("choose 3 to Check Balance");
                int aa ;
                aa = sc.nextInt();
                switch(aa){
                    case 1:
                    System.out.println("Enter the amount to withdraw");
                    int withdraw;
                    withdraw = sc.nextInt();
                    if(obj[store].account_balance>= withdraw){
                        System.out.println("Your withdraw amount is :" + withdraw);
                        obj[store].account_balance = (obj[store].account_balance - withdraw);
                        System.out.println("Your remaining account balance is " + obj[store].account_balance );
                        break;
                    }
                    else {
                        System.out.println("Insufficient balance ");
                        break;
                    }
                    case 2:
                    System.out.println("Enter amount to be deposited ");
                    int deposit = sc.nextInt();
                    obj[store].account_balance += deposit;
                    System.out.println("Your amount "+ deposit   +" is deposited and current balance is " + obj[store].account_balance);
                    break;
                    case 3:
                    System.out.println("Your current balance is :"+obj[store].account_balance);
                    break;
                    default : 
                    System.out.println("Invalid Input :");
                }

            

            }
            else{
                System.out.println("You have entered the correct Account Number but wrong Password");
            }
        }
        
    }
}