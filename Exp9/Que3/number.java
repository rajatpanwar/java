 public class number
{
public static void main(String arg[])throws Exception
{
data d1=new data();
data d2=new data();
data d3=new data();
data d4=new data();
data d5=new data();
data d6=new data();
data d7=new data();
data d8=new data();
data d9=new data();
data d10=new data();
System.out.println(d9.count);
}
}
class item { static int count=0; }
class data extends item implements Runnable
{
item d=this;
Thread t;
data()
{
t=new Thread(this);
t.start();
}
public void run()                                                    
{ d=syn.increment(d); }
}
class syn
{
synchronized static item increment(item i)                                    //using synchronization
{
i.count++;
return(i);
}
}
