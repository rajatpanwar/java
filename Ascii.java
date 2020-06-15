public class Ascii
{
  public static void main(String[] args)       
  {
    for(int x=0; x<=127; x++)                     //there are 127 characters and every one has their own ascii values
    {
     System.out.printf("%d : %c \n",x,x);
    }
  }
}
