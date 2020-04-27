public class Buffer
{
    public static String toUpperCase(StringBuffer s)
{
    String str = "";
    for(int x=0; x<s.length(); x++){
        char ch = s.charAt(x);
        if(ch >= 'a' && ch <= 'z')
            str += "" + (char)(ch - 32);      //convert lowerr case to upper case  
        else
            str += "" + ch; 
    }
    return str;
}

public static void main(String[] args)
{
    System.out.println(toUpperCase(new StringBuffer("rajat Panwar")));
        System.out.println(toUpperCase(new StringBuffer("RithIK ChoUdhary")));
      System.out.println(toUpperCase(new StringBuffer("Harshil Bhardwaj")));
      System.out.println(toUpperCase(new StringBuffer("nipun singal")));
       System.out.println(toUpperCase(new StringBuffer("Rakshit KaPoOr")));  
}
}
