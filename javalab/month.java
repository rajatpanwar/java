import java.util.Scanner;
public class Lab3
{
  public static void main(String[] strings)
  {
    Scanner input = new Scanner(System.in);

        String MonthOfName;

        System.out.print("Input a month number: ");
        int month = input.nextInt();

       

        switch (month) {
            case 1:
                MonthOfName = "January";
               System.out.println("january");
                break;
            case 2:
                MonthOfName = "February";
               System.out.println("february");
                break;
            case 3:
                MonthOfName = "March";
                System.out.println("march");
                break;
            case 4:
                MonthOfName = "April";
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                 break;
            case 6:
                System.out.println("jun");
                 break;
            case 7:
                System.out.println("july");
                 break;
            case 8:
                System.out.println("august");
                 break;
            case 9:
                System.out.println("september");
                 break;
            case 10:
                System.out.println("october");
                 break;
            case 11:
                System.out.println("november");
                  break;
             case 12:
                System.out.println("december");
                 break;
            default:
                 System.out.println("month not found");
                  break;
                  
        }

          
    
  }
}  
