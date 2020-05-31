class Outer
{
   static String name="rajat";
     static class Inner
        {
           void msg()
              {
                   System.out.println("Name is:" +name);
              }
         } 
     public static void main(String[] args)
        {
           Outer.Inner obj = new Outer.Inner();   //no need to create Outer class object
            obj.msg();
         }
}

//dont need to be created the object of outer class because nested class is static 
//and static properties,methods or classes can be accessed with out object 
