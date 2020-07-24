class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
 }  
}  


<<---------- a thread can never start again thread run only aone time . it will throw exception second time ---------->>>>

  class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();
t1.start();      //it will throw exception llegalThreadStateException
 }  
}  

