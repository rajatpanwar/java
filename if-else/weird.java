public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String sol=" ";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         if(N%2!=0)
         {
             sol = ("Weird");
         }
         else{
            if(N>=2&&N<=5)
            {
              sol = ("Not Weird");  
            }
            else if(N>=6&&N<=20)
            {
                sol = ("Weird");
            }
            else
            {
                sol = ("Not Weird");
            }
         }
        System.out.println(sol);

        scanner.close();
    }
}
