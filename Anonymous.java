abstract class Person
{
       abstract void animal();
}
     
    class Anonymous
        {
            public static void main(String[] args)
               {
                  Person p=new Person()
                 { 
                    void animal()
                      {
                         System.out.println("LION IS A BRAVE ANIMAL");
                       }
                  };
                     p.animal();
                }
           }




//An object of Anonymous class is created that is referred by p reference 
//variable of Person type.
