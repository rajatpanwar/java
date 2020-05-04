import java.util.HashMap;

public class Main6 {

public static void main(String[] args) {
		HashMap <Integer,String> obj=new HashMap();  //making object of HashMap
obj.put(1, "Rajat");    //Adding values in HashMap
obj.put(2, "Sangam");
obj.put(3, "Rohit");
System.out.println(obj.containsKey(3));    //checking whether HashMap contains a particular key or not
System.out.println(obj.containsValue("Vishnoi"));  //checking whether HashMap contains a particular value or not
System.out.println(obj.keySet());  //to get all the keys from the HashMap
System.out.println(obj);
	}

}
