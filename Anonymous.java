abstract class Person                             //abstract class
{
       abstract void animal();
}
     
    class Anonymous
        {
            public static void main(String[] args)
               {
                  Person p=new Person()                  //new class of abstract class
                 { 
                    void animal()
                      {
                         System.out.println("LION IS A BRAVE ANIMAL");        
                       }
                  };
                     p.animal();
                }
           }










//Anonymous class should be used when you are override the method of class or interface.

//An object of Anonymous class is created that is referred by p reference 
//variable of Person type.
