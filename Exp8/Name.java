public class Name
{
   public static void main(String[] args)
   {    
       int j;
       int incr=0;
       String n="Rajat Panwar";
       System.out.println("Name is:---"+n);
       System.out.println("String length is:- "+n.length());     //find the length of given string
        for(j=0;j<n.length();j++)
          {
             if(n.charAt(j)=='a' || n.charAt(j)=='a')             
               {
                 incr++;
                 System.out.println("position is of element a:-"+j);
                 System.out.println("element is found"+incr+"times");
               }
            
          }
       if(incr==0)
         {
              System.out.println("This string has no 'a' elemnt");
          }
}

}
