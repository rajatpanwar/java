import java.util.Scanner;
 public class account { //make a super class account
   int balance =500;//declare min balance
   int rate=4;//declare intrest rate for compound intrest
   
    public static void main(String[] args) {
        sav_acct obj=new sav_acct();// make object of saving account
        cur_acct obj1=new cur_acct();//make object of current account
        
     Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
      String customer_name =sc.nextLine();
        System.out.println("enter your account number");
      int account_number =sc.nextInt();
        System.out.println("enter type of account");
        System.out.println("types S for saving account and C for current account");
        char type=sc.next().charAt(0);
        boolean q=true;//condition to return back to the menu
        while(q){
        if(type=='S'){
            
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.compound intrest");
            System.out.println("4.EXIT");
            System.out.println("enter any no. to perform the task");
            int n=sc.nextInt();
          switch(n){
                case 1:
                    obj.deposit();
                    break ;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.compound();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid");
                
            }
        }
        else{
            System.out.println("1.display balance");
             System.out.println("2.EXIT");
             System.out.println("enter number to perform the following task");
            int c=sc.nextInt();
            if(c==1)
             obj1.display();
            else{
                System.exit(0);
            }
          } } } }
   
